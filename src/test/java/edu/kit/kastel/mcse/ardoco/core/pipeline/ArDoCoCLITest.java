/* Licensed under MIT 2022-2023. */
package edu.kit.kastel.mcse.ardoco.core.pipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.kit.kastel.mcse.ardoco.core.api.models.ArchitectureModelType;

class ArDoCoCLITest {
    private static final String OUTPUT = "src/test/resources/testout";
    private static final String TEXT = "./src/test/resources/teammates/teammates.txt";
    private static final String MODEL = "./src/test/resources/teammates/teammates.repository";
    private static final String MODEL_UML = "./src/test/resources/teammates/teammates.uml";
    private static final String NAME = "teammates";

    @Test
    @DisplayName("Testing CLI with provided text file")
    void pipelineWithTextTest() {
        String[] args = { "-n", NAME, "-ma", MODEL, "-t", TEXT, "-o", OUTPUT };
        var runner = ArDoCoCLI.parseCommandLineAndBuildArDoCoRunner(args);

        Assertions.assertNotNull(runner);
        Assertions.assertTrue(runner.isSetUp());
    }

    @Test
    @DisplayName("Testing CLI with provided text file and UML Model")
    void pipelineWithTextAndUMLTest() {
        String[] args = { "-n", NAME, "-ma", MODEL_UML, "-mt", ArchitectureModelType.UML.name(), "-t", TEXT, "-o", OUTPUT };
        var runner = ArDoCoCLI.parseCommandLineAndBuildArDoCoRunner(args);

        Assertions.assertNotNull(runner);
        Assertions.assertTrue(runner.isSetUp());
    }

    @Test
    @DisplayName("Testing CLI without provided text file")
    void pipelineWithProvidedWrongTextTest() {
        String[] args = { "-n", NAME, "-ma", MODEL, "-o", OUTPUT };
        var runner = ArDoCoCLI.parseCommandLineAndBuildArDoCoRunner(args);
        Assertions.assertNull(runner);
    }

    @Test
    @DisplayName("Testing CLI with wrong text")
    void pipelineWithNonexistentTextTest() {
        String[] args = { "-n", NAME, "-ma", MODEL, "-t", "NONEXISTENT", "-o", OUTPUT };
        var runner = ArDoCoCLI.parseCommandLineAndBuildArDoCoRunner(args);
        Assertions.assertNull(runner);
    }

    @Test
    @DisplayName("Testing CLI with wrong model")
    void pipelineWithNonexistentModelTest() {
        String[] args = { "-n", NAME, "-ma", "NONEXISTENT", "-t", TEXT, "-o", OUTPUT };
        var runner = ArDoCoCLI.parseCommandLineAndBuildArDoCoRunner(args);
        Assertions.assertNull(runner);
    }
}
