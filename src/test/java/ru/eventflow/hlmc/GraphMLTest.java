package ru.eventflow.hlmc;

import org.junit.Test;

public class GraphMLTest {

    @Test
    public void testSerialization() {
        HybridFrame frame = FixturesHLModelBuilder.buildFixtureOne();
        String s = GraphMLWriter.serialize(frame);
        System.out.println(s);
    }
}
