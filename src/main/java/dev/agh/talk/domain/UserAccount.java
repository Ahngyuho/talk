package dev.agh.talk.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    private LocalDateTime birthday;

    //TODO : 프로필 사진 어떤 식으로 할지 생각
//    private
}
