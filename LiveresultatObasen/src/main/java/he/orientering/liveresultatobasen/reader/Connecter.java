package he.orientering.liveresultatobasen.reader;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Henrik on 2013-06-30.
 */
//TODO:Write all functions to get all information;
//TODO:better the getCompetitions();
public class Connecter {
    public static HashSet<ArrayList> getCompetitioins() throws IOException {
        URL command = Commands.getCompetitions();


        HashSet set = new HashSet<ArrayList>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> organizer = new ArrayList<String>();
        ArrayList<String> date = new ArrayList<String>();
        ArrayList<Integer> id = new ArrayList<Integer>();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(command.openStream()));
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            id.add(jsonReader.nextInt());
            name.add(jsonReader.nextString());
            organizer.add(jsonReader.nextString());
            date.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        set.add(id);
        set.add(organizer);
        set.add(date);
        set.add(id);
        return set;
    }


}
