import java.util.HashMap;
import java.util.Set;

class Map{
    public static void main(String [] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Hangar 18","Possibly I've seen too much Hangar 18, I know too much");
        trackList.put("Numb","I've become so numb, I can't feel you there");
        trackList.put("Toxicity","You, what do you own the world?, How do you own disorder? Disorder");
        trackList.put("Holy Thunderforce","So we'll fight against the wind for the glory of the kings, To defeat the evil enemies");

        String favorite = trackList.get("Numb");

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            if(key.equals("Numb")){
                System.out.println("Track favorite: "+key+" - Lyrics: "+favorite);
            } else{
                System.out.println("Track: "+key+" - Lyrics: "+trackList.get(key));
            }
        }
    }
}