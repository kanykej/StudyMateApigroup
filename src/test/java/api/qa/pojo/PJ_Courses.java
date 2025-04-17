package api.qa.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = false)
public class PJ_Courses {
    private String imageId;
    private String courseName;
    private String dateOfFinish;
    private String description;
    private String studentId;
    private String fullName;
    private String groupName;
    private String studyFormat;
    private String phoneNumber;
    private String isBlocked;
    private String email;
    private String specialization;
    private String dateOfStart;
    private String objects;
    private String id;
    private String fileId;
    private String file;
    private String key;
    private String isDefault;
    private String originalName;
    private String groupId;
    private String group;
    private String task;
    private String ratingDistribution;
    private String exam;
    private String test;



}