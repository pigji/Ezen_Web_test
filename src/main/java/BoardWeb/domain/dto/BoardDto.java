package BoardWeb.domain.dto;

import BoardWeb.domain.entity.BoardEntity;
import lombok.*;

@NoArgsConstructor // 빈 생성자
@AllArgsConstructor // 풀생성자
@Getter @Setter @ToString @Builder

public class BoardDto {

    private int bno;
    private String btitle;
    private String bcontent;

    // 생성자 : 생성자를 선언할때 BoardEntity에서 생성한 생성자 순서와 같아야 된다. [ 순서가 다르면 오류가 나타남 ]
    public BoardEntity toEntity(){
        return new BoardEntity(
                this.bno,
                this.btitle,
                this.bcontent );
    }

} // class end
