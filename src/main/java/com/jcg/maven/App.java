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
}
