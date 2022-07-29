package com.example.postdemo.controller.api;

import com.example.postdemo.dto.BoardDto;
import com.example.postdemo.dto.RequestBoardPostDto;
import com.example.postdemo.dto.RequestBoardUpdateDeleteCheckDto;
import com.example.postdemo.dto.ResponseBoardDto;
import com.example.postdemo.service.impl.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    private final BoardServiceImpl boardService;

    @Autowired
    public BoardController(BoardServiceImpl boardService){
        this.boardService = boardService;
    }

    @GetMapping("/api/board")
    public List<ResponseBoardDto> getAllBoardList(){
        return boardService.getAllBoardList();
    }

    @GetMapping("/api/board/{id}")
    public ResponseBoardDto getBoardList(@PathVariable long id){
        return boardService.getBoard(id);
    }

    @PostMapping("/api/board")
    public boolean postBoard(@RequestBody RequestBoardPostDto requestBoardPostDto){
        return boardService.postBoard(requestBoardPostDto);
    }

    @PostMapping("/api/board/securityCheck")
    public boolean postCheckBoard(@RequestBody RequestBoardUpdateDeleteCheckDto requestBoardUpdateDeleteCheckDto){
        return boardService.checkPasswordBoard(requestBoardUpdateDeleteCheckDto);
    }


    @PutMapping("/api/board")
    public void updateBoard(@RequestBody BoardDto boardDto){
        boardService.reviseBoard(boardDto);
    }

    @DeleteMapping("/api/board")
    public void deleteBoard(@RequestBody RequestBoardUpdateDeleteCheckDto requestBoardUpdateDeleteCheckDto){
        boardService.deleteBoard(requestBoardUpdateDeleteCheckDto);
    }

}
