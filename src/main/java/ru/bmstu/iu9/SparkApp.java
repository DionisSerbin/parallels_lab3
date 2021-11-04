package ru.bmstu.iu9;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkApp {

    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName("lab3 Spark App");
        JavaSparkContext sc = new JavaSparkContext(conf);
    }
}
