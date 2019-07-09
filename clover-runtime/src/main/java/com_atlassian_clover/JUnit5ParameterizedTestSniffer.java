package com_atlassian_clover;

import org.jetbrains.annotations.NotNull;

public class JUnit5ParameterizedTestSniffer implements TestNameSniffer {

    /**
     * Value holder
     */
    private final BaseTestNameSniffer testNameSniffer = new BaseTestNameSniffer();

    public void testStarted(@NotNull String testName) {
        testNameSniffer.setTestName(testName);
    }

    public void testEnded() {
        testNameSniffer.clearTestName();
    }

    @Override
    public String getTestName() {
        return testNameSniffer.getTestName();
    }
}
