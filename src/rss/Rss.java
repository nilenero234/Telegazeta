
package rss;

import java.io.*;
import java.net.*;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Locale;

public class Rss {
    
    public static void main(String[] args) {
        
        Telegazeta telegazeta = new Telegazeta();
        System.out.println(telegazeta.readRSS("https://teletydzien.interia.pl/hity/filmy/feed"));
        //System.out.println(readRSS("http://teletydzien.interia.pl/hity/filmy/feed"));
        // http://programtv.interia.pl/feed
        // http://teletydzien.interia.pl/hity/filmy/feed
        // http://teletydzien.interia.pl/hity/seriale/feed
    }
}

