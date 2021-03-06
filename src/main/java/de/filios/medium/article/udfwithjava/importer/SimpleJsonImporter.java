package de.filios.medium.article.udfwithjava.importer;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.log4j.Logger;


public class SimpleJsonImporter {

    private SparkSession spark;
    private static Logger log = Logger.getLogger(SimpleJsonImporter.class);

    public SimpleJsonImporter(SparkSession spark) {
        this.spark = spark;
    }

    public Dataset<Row> readJson(String fileName){
        return  this.spark.read()
                .format("json")
                .option("multiline",true)
                .load(fileName);
    }
}
