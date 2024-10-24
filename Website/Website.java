
import java.io.*;
import java.net.*;

public class Website {

 // Put your code here.
 private String domain;
 private String topLevelDomain;
 private long numUsers;
 private GeoLocation geoLocation;

//Default constructor.
public Website() {
    domain = "google";
    topLevelDomain = "com";
    numUsers = 4_300_000_000L;
    geoLocation = new GeoLocation(41.2219, 95.8608);
}

// Specify website URL.
// Register a new website.
public Website(String domainName, String topDomain) {
    domain = domainName;
    topLevelDomain = topDomain;
    numUsers = 0;
    geoLocation = new GeoLocation(40.935, -74.1176);
}

// Specify website URL.
// Register an old website.
public Website(String domainName, String topDomain, long numPeople, GeoLocation g) {
    domain = domainName;
    topLevelDomain = topDomain;
    numUsers=numPeople;
    geoLocation = g;
}

public GeoLocation getLocation(){
    return geoLocation;
}

    // Method to fetch data.
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api+"/";

        try {
            // Create the URL from the provided string.
         
            URL url = new URL(urlString);
            
            // Open a connection to the API.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line.
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly.
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing.
    // Do not modify this method.
    public String toString()
    {
        
        String res =  "http://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {
        // Website website = new Website("randomuser", "me"); // Create an instance of Website.
        // website.fetchData("api"); // Call the instance method.
        
        // Website website2 = new Website();
        // System.out.println(website2);
        
        // Website website3 = new Website("google", "com", 10000000);
        // System.out.println(website3);

        Website website1 = new Website("ip-api", "com");
        website1.fetchData("json");
        Website google = new Website();
        Website aws = new Website("aws", "com", 1_000_000L, new GeoLocation(38.9339, 77.1773));

        // System.out.println(website1.getLocation().getLongitude());
        // System.out.println(google.getLocation().getLatitude());
        System.out.println("My distance to Google: " + google.getLocation().distanceFrom(website1.getLocation()) + " miles.");
        System.out.println("Google To Amazon: " + google.getLocation().distanceFrom(aws.getLocation()) + "Miles");
    }
}
