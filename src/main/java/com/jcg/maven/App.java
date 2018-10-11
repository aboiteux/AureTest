package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! How are you ?" );
    }

    public void anotherMethodWithIssues() {
        // Prepare metadata file
        String metadataContent;
        try {
            System.out.println("a try catch statement");
            // HashMap<String, String> ymlMap = stringYmlToMap(metadataContent);
            // ymlMap.put("pop-name", epmService
            // .getPopName(epmService.getRe().getHostIp(), "compose"));
            // logger.info("New value for the field pop-name: {}",
            // ymlMap.get("pop-name"));

            // logger.info("New metadata content: {}",
            // simpleYmlMapToString(ymlMap));
            // filesService.writeFileFromString(simpleYmlMapToString(ymlMap),
            // metadataFile);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "A runtime exception.");
        }
    }

    public void methodsWithBugs() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
    }

    private final static String CODE = "bounteous";

    public String calculateCode() {
        doTheThing();
        return CODE;
    }

    private void doTheThing() {
        System.out.println("Doing the thing");
    }

    public String getName() {  // Noncompliant
        doTheThing();
        return CODE;
    }
}
