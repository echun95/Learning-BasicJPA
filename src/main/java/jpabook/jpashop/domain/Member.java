package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Member extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
