package de.filios.medium.article.udfwithjava;

import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class MainApp {

    private static Logger log = Logger.getLogger(MainApp.class);


    private SparkSession spark;

    public static void main(String[] args) {
        log.debug(new MainApp().getGreeting());
    }

    public MainApp() {
        spark = createSparkSession();
    }

    public String getGreeting() {
        return "Main App - is App and running";
    }

    private SparkSession createSparkSession() {
        SparkSession spark = SparkSession.builder()
                .appName("Main App Spark Session")
                .master("local")
                .getOrCreate();
        return spark;
    }

    public SparkSession getSpark() {
        return spark;
    }

}
