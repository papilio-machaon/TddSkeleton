package com.oocode;

public interface Robot {
    public String moveOnto(int a, int b);

    public String moveOver(int a, int b);
    public String pileOnto(int a, int b);
    public String pileOver(int a, int b);
    public void quit();

    public void setNumberOfBlocks(int a);




}
