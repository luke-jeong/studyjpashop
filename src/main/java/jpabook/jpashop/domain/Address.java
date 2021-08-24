package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
//단순히 가독성을 위한 기능?
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
