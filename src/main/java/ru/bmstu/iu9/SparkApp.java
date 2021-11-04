package ru.bmstu.iu9;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;

import java.util.Map;

public class SparkApp {

    private static final String CODE = "Code";
    private static final String QUOTE = "\"";
    private static final String NULL_STR = "";
    private static final String COMMA = ",";

    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName("lab3 Spark App");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsFile = sc.
                textFile("664600583_T_ONTIME_sample.csv");

        JavaRDD<String> airportsFile = sc.
                textFile("L_AIRPORT_ID.csv");

        JavaPairRDD<
                Integer,
                String
                > dataAirport = airportsFile.
                filter(s -> !s.contains(CODE)).
                mapToPair(s -> {
                            s = s.replace(QUOTE, NULL_STR);
                            int firstCommaIndex = s.indexOf(COMMA);
                            return new Tuple2<>(
                                    Integer.valueOf(
                                            s.substring(0, firstCommaIndex)
                                    ),
                                    s.substring(firstCommaIndex + 1, s.length())
                            );
                        }
                );

        final Broadcast<
                Map<
                        Integer,
                        String
                        >
                > broadcastedAirports = sc.broadcast(
                                dataAirport.collectAsMap()
        );

        JavaPairRDD<>
    }
}
