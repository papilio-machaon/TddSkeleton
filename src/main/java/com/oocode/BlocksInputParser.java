package com.oocode;

public class BlocksInputParser {

    private Robot robot;

    public BlocksInputParser(Robot r)
    {
        robot = r;
    }

    public void parseCommands(String[] instructions)
    {
        for (String instruction: instructions) {
            parse(instruction);
        }
    }
    public void parse(String s)
    {
        String[] inputValues = s.split(" ");
        String robotAction;
        if(inputValues.length == 4)
        {
            robotAction = inputValues[0] + " " + inputValues[2];
        }
        else
        {
            robotAction = inputValues[0];
        }

        switch (robotAction)
        {
            case "move onto":
                robot.moveOnto(Integer.parseInt(inputValues[1]), Integer.parseInt(inputValues[3]));
                break;
            case "move over":
                robot.moveOver(Integer.parseInt(inputValues[1]), Integer.parseInt(inputValues[3]));
                break;
            case "pile onto":
                robot.pileOnto(Integer.parseInt(inputValues[1]), Integer.parseInt(inputValues[3]));
                break;
            case "pile over":
                robot.pileOver(Integer.parseInt(inputValues[1]), Integer.parseInt(inputValues[3]));
                break;
            case "quit":
                robot.quit();
                break;
            default:
                robot.setNumberOfBlocks(Integer.parseInt(robotAction));

        }
    }
}
