package ru.eventflow.hlmc;

import java.util.HashMap;
import java.util.Map;

/**
 * Variable assignment for HL formulas (the ``g'' in $[ \! [ \cdot ] \! ]^{\mathcal{M}, g}$)
 */
public class WVarAssignment {

    /**
     * world variable assignments
     */
    private Map<String, String> wvarAssignments;

    protected WVarAssignment() {
        this(new HashMap<String, String>());
    }

    protected WVarAssignment(Map<String, String> wvarAssignments) {
        this.wvarAssignments = wvarAssignments;
    }

    /**
     * Copy constructor
     */
    static WVarAssignment newInstance(WVarAssignment g) {
        return new WVarAssignment(g.getWvarAssignments());
    }

    Map<String, String> getWvarAssignments() {
        return wvarAssignments;
    }

    String getWVarAssign(String wvarLabel) {
        if (wvarAssignments.containsKey(wvarLabel)) {
            return wvarAssignments.get(wvarLabel);
        } else {
            return null;
        }
    }

    void setWVarAssign(String wvarLabel, String worldLabel) {
        wvarAssignments.put(wvarLabel, worldLabel);
    }

}
