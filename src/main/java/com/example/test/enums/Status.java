package com.example.test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor

public enum Status {
    BLOCKED("Заблокирован"),
    ACTIVE("Активный"),
    DELETED("Удаленный")
    ;
    String DESCRIPTION;


}
