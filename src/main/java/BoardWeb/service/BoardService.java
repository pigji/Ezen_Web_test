package BoardWeb.service;

import BoardWeb.domain.dto.BoardDto;
import BoardWeb.domain.entity.BaordRepository;
import BoardWeb.domain.entity.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BaordRepository boardRepository;

    // 2.
    public int bwrite(BoardDto boardDto){

        BoardEntity entity
                = boardRepository.save(boardDto.toEntity() );
        return entity.getBno();
    }
    // 3.
    public List<BoardDto> blist(){
        List<BoardEntity> elist = boardRepository.findAll();
        List<BoardDto> dlist = new ArrayList<>();
        for( BoardEntity entity : elist ){
            dlist.add( entity.toDto() );
        }
        return dlist;
    }






} // clas end
