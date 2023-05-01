package edu.nyu.cs;

import java.util.ArrayList;

/**
 * This interface file is given to you.
 */
public interface SequentiallyOrdered {

    public abstract OrderedThing getFirst();
    public abstract OrderedThing getLast();
    public abstract ArrayList<OrderedThing> getSequence();

}