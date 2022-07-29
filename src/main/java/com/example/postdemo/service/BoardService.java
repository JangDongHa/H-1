package com.example.postdemo.service;

import com.example.postdemo.domain.board.Board;
import com.example.postdemo.dto.BoardDto;
import com.example.postdemo.dto.RequestBoardPostDto;
import com.example.postdemo.dto.RequestBoardUpdateDeleteCheckDto;
import com.example.postdemo.dto.ResponseBoardDto;

import java.util.List;

public interface BoardService {
    boolean postBoard(RequestBoardPostDto requestBoardPostDto);
    ResponseBoardDto getBoard(long id);
    void deleteBoard(RequestBoardUpdateDeleteCheckDto requestBoardUpdateDeleteCheckDto);
    void reviseBoard(BoardDto boardDto);
    boolean checkPasswordBoard(RequestBoardUpdateDeleteCheckDto requestBoardUpdateDeleteCheckDto);
    List<ResponseBoardDto> getAllBoardList();
    List<ResponseBoardDto> makeBoardToResponseBoardDto(List<Board> boards);
}
