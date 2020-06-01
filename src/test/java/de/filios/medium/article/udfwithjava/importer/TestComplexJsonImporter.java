package de.filios.medium.article.udfwithjava.importer;

import de.filios.medium.article.udfwithjava.MainApp;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TestComplexJsonImporter")
public class TestComplexJsonImporter {

    @Test
    @DisplayName("Test: Simple JSON Reader")
    public void testReadJSON() {
        MainApp app  = new MainApp();
        ComplexJsonImporter importer = new ComplexJsonImporter(app.getSpark());
        Dataset<Row> df = importer.readJson("./src/test/resources/udfwithjava/complex.json");
        df = df.cache();
        df.show();
        df.printSchema();
    }

}
