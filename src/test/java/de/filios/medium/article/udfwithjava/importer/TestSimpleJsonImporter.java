package de.filios.medium.article.udfwithjava.importer;


import de.filios.medium.article.udfwithjava.MainApp;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TestSimpleJsonImporter")
public class TestSimpleJsonImporter {

    @Test
    @DisplayName("Test: Simple JSON Reader")
    public void testReadJSON() {
        MainApp app  = new MainApp();
        SimpleJsonImporter simpleJsonImporter = new SimpleJsonImporter(app.getSpark());
        Dataset<Row> df = simpleJsonImporter.readJson("./src/test/resources/udfwithjava/trivial.json");
        assertEquals(1,df.count());
        assertEquals("Germany",df.first().getString(0));
        assertEquals("Filios",df.first().getString(1));
        assertEquals("Georg",df.first().getString(2));
    }

}
