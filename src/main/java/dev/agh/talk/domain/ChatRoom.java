package dev.agh.talk.domain;

import javax.persistence.*;

@Entity
public class ChatRoom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_room_id")
    private Long id;
    private String chatRoomName;
    private Long totalUser;

}
