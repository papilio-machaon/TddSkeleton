package com.oocode;

import org.junit.Test;

import static org.mockito.BDDMockito.mock;
import static org.mockito.BDDMockito.verify;

public class BlocksInputParserTest {
    @Test
    public void parserAcceptsMoveOntoStrings() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("move 4 onto 5");
        verify(robotInterface).moveOnto(4,5);
    }

    @Test
    public void parserAcceptsMoveOverStrings() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("move 4 over 5");
        verify(robotInterface).moveOver(4,5);
    }

    @Test
    public void parserAcceptsPileOntoStrings() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("pile 4 onto 5");
        verify(robotInterface).pileOnto(4,5);
    }
    @Test
    public void parserAcceptsPileOverStrings() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("pile 4 over 5");
        verify(robotInterface).pileOver(4,5);
    }
    @Test
    public void parserAcceptsQuitString() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("quit");
        verify(robotInterface).quit();
    }

    @Test
    public void parserAcceptsNumOfBlocks() {
        Robot robotInterface = mock(Robot.class);
        BlocksInputParser blockInputParser = new BlocksInputParser(robotInterface);
        blockInputParser.parse("10");
        verify(robotInterface).setNumberOfBlocks(10);
    }


}

// move onto, move over, pile onto, pile over, quit