package api.qa.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pj_Students {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String groupId;
    private String studyFormat;

}
