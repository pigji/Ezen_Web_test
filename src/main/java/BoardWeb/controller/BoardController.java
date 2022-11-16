package BoardWeb.controller;

import BoardWeb.domain.dto.BoardDto;
import BoardWeb.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired // @Autowired : 제어를 역전할 수 있는 방법 중 하나 , 제어권을 spring한테 넘긴다.
    private BoardService boardService;

    // 1. HTML
    @GetMapping("/")    // 최상위 경로
    public Resource index(){   // Resource : HTML 파일을 불러오기 위해 사용 [ 정적폴더 : 고정된 파일을 불러오기 위해 ]
        return  new ClassPathResource("index.html");
    }

    // 2. 글쓰기
    @PostMapping("/bwrite") // URL
    public int bwrite(@RequestBody BoardDto boardDto){
        int result = boardService.bwrite(boardDto);
        return result;
    }

    // 3. 글목록
    @GetMapping("/blist")   // URL
    public List<BoardDto> blist(){
        return boardService.blist();
    }

} // clas end
