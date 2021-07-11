package constants;

import static constants.Constants.Path.SWAPI_PATH;
import static constants.Constants.Servers.*;

public class Constants {
    public static class RunVariable {
        public static String server = SWAPI_URL;
        public static String path = "";
    }

    public static class Servers {
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com";
        public static String REQUESTBIN = "https://68eb699e2466b10ee75b53fc3c338673.m.pipedream.net";
        public static String GOOGLE_PLACES_URL;
    }

    public static class Path {
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;
    }

    public static class Actions {
        // swapi
        public static String SWAPI_GET_PEOPLE = "people/";
        // google

        // json place holder
        public  static String JSONPLACEHOLDER_GET = "comments";
        public static  String JSONPLACEHOLDER_POST = "posts/";
        public static String JSONPLACEHOLDER_PUT = "posts/1/";
        public  static String JSONPLACEHOLDER_DELETE = "posts/1/";
    }
}
