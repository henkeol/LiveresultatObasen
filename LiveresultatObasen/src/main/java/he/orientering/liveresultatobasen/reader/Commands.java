package he.orientering.liveresultatobasen.reader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Contains the commands to get JSON from obasen.nu/liveresultat.
 * Created by Henrik on 2013-06-29.
 */
public class Commands {

    /**
     * @return URL
     * @throws WrongArgumentException
     */
    public static URL getCompetitions() {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?method=getcompetitions");
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }
    }

    /**
     * Return a URL to get the three last passing from the competition.
     *
     * @param CompNr the competitions number
     * @return URL
     * @throws WrongArgumentException
     */
    public static URL getLastPassingCommand(int CompNr) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?method=getlastpassings&comp=" + CompNr
                    + "&last_hash=");
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }
    }

    /**
     * Return a URL to get the three last passing from the competition.
     *
     * @param CompNr   The competition number of the competition
     * @param lastHash the hash String.
     * @return URL
     * @throws WrongArgumentException
     */

    public static URL getLastPassingCommand(int CompNr, String lastHash) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?method=getlastpassings&comp=" + CompNr
                    + "&last_hash=" + lastHash);
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }

    }

    /**
     * return the url to get the classes on the competitons
     *
     * @param CompNr the Competitions Number
     * @return URL
     * @throws WrongArgumentException
     */

    public static URL getClasses(int CompNr) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?method=getclasses&comp=" + CompNr +
                    "&last_hash=");
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }
    }

    /**
     * return the url to get the classes on the competitons
     *
     * @param CompNr   the Competitions Number
     * @param lastHash the last_ hash
     * @return URL
     * @throws WrongArgumentException
     */
    public static URL getClasses(int CompNr, String lastHash) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?method=getclasses&comp=" + CompNr +
                    "&last_hash=" + lastHash);
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }

    }

    /**
     * Get the classResultsURL
     *
     * @param CompNr    the Competitions Number
     * @param ClassName the name of the class
     * @return URL
     * @throws WrongArgumentException
     */

    public static URL getClassResults(int CompNr, String ClassName) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?comp=" +
                    CompNr + "&method=getclassresults&unformattedTimes=true&class=" + ClassName);
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }
    }

    /**
     * Get the classResultsURL
     *
     * @param CompNr    the Competitions Number
     * @param ClassName the name of the class
     * @param lastHash  the last Hash.
     * @return URL
     * @throws WrongArgumentException
     */
    public static URL getClassResults(int CompNr, String ClassName, String lastHash) {
        try {
            return new URL("http://obasen.nu/liveresultat/api.php?comp=" +
                    CompNr + "&method=getclassresults&unformattedTimes=true&class=" + ClassName + "&last_hash=" + lastHash);
        } catch (MalformedURLException e) {
            throw new WrongArgumentException(e.getMessage());
        }
    }

    /**
     * A Exception to handel things i the he.orientering.liveresultat.reader
     */
    public static class WrongArgumentException extends IllegalArgumentException {

        String exceptionMessage;

        WrongArgumentException() {
            exceptionMessage = "You have give a wrong Argument";
        }

        WrongArgumentException(String errMsg) {
            exceptionMessage = "You have give a wrong Argument \n" + errMsg;
        }

    }


}


