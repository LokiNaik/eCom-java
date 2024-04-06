package com.app.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User model
 */
@Data
@Document(collection = "user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends Base {
    @Schema(name = "id", example = "1", description = "id for the user")
    private String id;
    @Schema(name = "name", example = "lokesh", description = "name of user")
    private String name;
    @Schema(name = "username", example = "loke", description = "username of user")
    private String username;
    @Schema(name = "email", example = "gugulothlokesh1998@gmail.com", description = "email of the user")
    private String email;
    @Schema(name = "password", example = "*******", description = "password")
    private String password;
    @Schema(name = "Address", description = "Address")
    private Address address;
}
