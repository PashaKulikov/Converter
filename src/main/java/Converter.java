import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile = "user.json";

    public static void toJSON(Student student) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), student);
        System.out.println("json created!");
    }

    public static Student toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), Student.class);
    }

    public static void main(String[] args) throws IOException {

        toJSON(new Student(11,"Pasha","1.0"));
        Student student = Converter.toJavaObject();
       System.out.println(student);
    }
}
