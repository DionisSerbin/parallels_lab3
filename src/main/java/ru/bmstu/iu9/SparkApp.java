package ru.bmstu.iu9;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkApp {

    private static final String 

    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName("lab3 Spark App");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsFile = sc.
                textFile("664600583_T_ONTIME_sample.csv");

        JavaRDD<String> airportsFile = sc.
                textFile("L_AIRPORT_ID.csv");

        JavaPairRDD<Integer, String> dataAirport = airportsFile.
                filter(s -> !s.contains())
    }
}
