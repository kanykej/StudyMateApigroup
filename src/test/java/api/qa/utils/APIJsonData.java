package api.qa.utils;

public class APIJsonData {
    public static String addGroup(String expectedGroupName, String expectedDate, String expectedDescription){
        return "{\n" +
                "  \"imageId\": 0,\n" +
                "  \"groupName\": \"" + expectedGroupName + "\",\n" +
                "  \"dateOfFinish\": \"" + expectedDate + "\",\n" +
                "  \"description\": \"" + expectedDescription + "\"\n" +
                "}";
    }



    public static String addStudent(String name, String lastName, String phoneNumber,String email, String groupId, String studyFormat){
        return " {\n" +
                "   \n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"lastName\": \""+lastName+"\",\n" +
                "    \"phoneNumber\": \""+phoneNumber+"\",\n" +
                "    \"email\": \""+email+"\",\n" +
                "    \"groupId\": "+groupId+",\n" +
                "    \"studyFormat\": \""+studyFormat+"\"\n" +
                "}";

    }
    public static String createCourse(String courseName, String courseDate, String description) {

        return

                "{\n" +
                        "  \"imageId\": 0,\n" +
                        "  \"courseName\": \""+courseName+"\",\n" +
                        "  \"dateOfFinish\": \""+courseDate+"\",\n" +
                        "  \"description\": \""+description+"\"\n" +
                        "}";
    }


}

