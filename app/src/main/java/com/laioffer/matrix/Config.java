package com.laioffer.matrix;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public static String username = null;

    public static final String POLICE = "Police";
    public static final String TRAFFIC = "Traffic";
    public static final String NO_ENTRY = "No Entry";
    public static final String NO_PARKING = "No Parking";
    public static final String SECURITY_CAMERA = "Security Camera";
    public static final String HEADLIGHT = "Headlight";
    public static final String SPEEDING = "Speeding";
    public static final String CONSTRUCTION = "Construction";
    public static final String SLIPPERY = "Slippery";

    public static List<Item> listItems = new ArrayList<Item>() {
        {
            add(new Item(Config.POLICE, R.drawable.policeman));
            add(new Item(Config.TRAFFIC, R.drawable.traffic));
            add(new Item(Config.NO_ENTRY, R.drawable.no_entry));
            add(new Item(Config.NO_PARKING, R.drawable.no_parking));
            add(new Item(Config.SECURITY_CAMERA, R.drawable.security_camera));
            add(new Item(Config.HEADLIGHT, R.drawable.lights));
            add(new Item(Config.SPEEDING, R.drawable.speeding));
            add(new Item(Config.CONSTRUCTION, R.drawable.construction));
            add(new Item(Config.SLIPPERY, R.drawable.slippery));
        }
    };

}
