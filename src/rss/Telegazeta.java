package rss;

import java.io.*;
import java.net.*;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Locale;

public class Telegazeta {
    
private String dzień_tygodnia = "jutro";
private String wybór;

public void setDzieńTygodnia(String dzień_tygodnia){
    this.dzień_tygodnia = dzień_tygodnia;
}

public String getDzieńTygodnia(){
    return dzień_tygodnia;
}

public void setWybór(String wybór){
    this.wybór = wybór;
}

public String getWybór(){
    return wybór;
}

    public String readRSS(String urlAddress){
        try{
            URL rrsUrl = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rrsUrl.openStream()));
            String message="";
            String line;
            
            switch(dzień_tygodnia) {
            case "Poniedziałek":
            while((line=in.readLine())!=null){     
                   if(line.contains("Pn,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "Wtorek":
            while((line=in.readLine())!=null){     
                   if(line.contains("Wt,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "Środa":
            while((line=in.readLine())!=null){     
                   if(line.contains("Śr,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "Czwartek":
            while((line=in.readLine())!=null){     
                   if(line.contains("Cz,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "Piątek":
            while((line=in.readLine())!=null){     
                   if(line.contains("Pt,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }

                    }  
                }
            }
            break;
            case "Sobota":
            while((line=in.readLine())!=null){     
                   if(line.contains("Sb,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "Niedziela":
            while((line=in.readLine())!=null){     
                   if(line.contains("Nd,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "dziś":
            while((line=in.readLine())!=null){     
                   if(line.contains("dziś,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
            case "jutro":
            while((line=in.readLine())!=null){     
                   if(line.contains("jutro,")) {
                        if(line.contains("<title>")){
                             if(line.contains("[CDATA[")){
                             int oindex = line.lastIndexOf("[");
                        
                            int eindex =line.indexOf("]");
                            String temp =line.substring(oindex, eindex);
                            message+=temp+"\n";
                        }
                    }  
                }
            }
            break;
        }
            in.close();    
            return message;
            }   
        catch(MalformedURLException ue){
        }   
        catch(IOException ioe){
        }
    return null;
    }
    
    
}

       /*
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        //System.out.println(new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));
        //System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
        String dzień_tygodnia = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        //System.out.println(dzień_tygodnia);
        dziś = "dziś";
        
        System.out.println(dzień_tygodnia);
         switch(dzień_tygodnia){
           case "Monday": 
               dzień_tygodnia = "Poniedziałek";    //Pn
               break;
           case "Tuesday": 
               dzień_tygodnia = "Wtorek";  //Wt
               break;
           case "Wednesday ":
               dzień_tygodnia = "Środa";   //Śr
               break;
           case "Thursday":
               dzień_tygodnia = "Czwartek";   // Cz
               break;
           case "Friday":
               dzień_tygodnia = "Piątek";  //Pt
               break;
           case "Saturday": 
               dzień_tygodnia = "Sobota";   //Sb
               break;
           case "Sunday":
               dzień_tygodnia = "Niedziela";   //Nd
               break;
        }
        System.out.println(dzień_tygodnia);        
        System.out.println(dzień_tygodnia); */
        