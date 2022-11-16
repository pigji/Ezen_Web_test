package BoardWeb.domain.entity;

import BoardWeb.domain.dto.BoardDto;
import lombok.*;

import javax.persistence.*;

@Entity // 테이블과 매핑되는 클래스    // @Entity를 사용하는 이유 : DB에서 따로 테이블을 생성하지 않아도 된다.
@Table(name = "board" )
@NoArgsConstructor // 빈 생성자
@AllArgsConstructor // 풀생성자
@Getter @Setter @ToString @Builder
public class BoardEntity {

    @Id // pk값 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY )    // auto key
        // @Id를 사용하면 @GeneratedValue()도 같이 써줘야 된다.
            // @ID와 @GeneratedValue를 사용하지 않고 실행하면 기본키가 없다고 오류가 뜬다.

    // 생성자
    private int bno;
    private String btitle;
    private String bcontent;


    public BoardDto toDto(){
        return BoardDto.builder()
                .bno( this.bno )
                .btitle( this.btitle )
                .bcontent( this.bcontent )
                .build();   // .build()를 사용하면 생성자 순서가 바뀌어도 상관없다.
    }

} // clas end
