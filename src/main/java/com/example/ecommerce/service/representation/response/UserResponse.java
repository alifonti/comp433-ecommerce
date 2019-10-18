package com.example.ecommerce.service.representation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
