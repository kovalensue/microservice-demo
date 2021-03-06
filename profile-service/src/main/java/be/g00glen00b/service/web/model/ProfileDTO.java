package be.g00glen00b.service.web.model;

import be.g00glen00b.service.data.Profile;

public class ProfileDTO extends SimpleProfileDTO {
    private String bio;

    public ProfileDTO(String username, String firstname, String lastname, String bio) {
        super(username, firstname, lastname);
        this.bio = bio;
    }

    public ProfileDTO() {
    }

    public String getBio() {
        return bio;
    }

    public static ProfileDTO fromEntity(Profile entity) {
        return new ProfileDTO(entity.getUsername(), entity.getFirstname(), entity.getLastname(), entity.getBio());
    }
}
