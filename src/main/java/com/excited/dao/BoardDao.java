package com.excited.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.excited.domain.Board;

@Repository
public interface BoardDao {
	public void addBoard(Board board);

	public List<Board> listAllBoard();

	public Board listAllPostsOfBoard(int boardId);

	public Board findBoardByBoardId(int boardId);

	public Board findBoardByBoardName(String boardName);

	public void updateBoardByBoard(Board board);

	public void deleteBoardById(int boardId);
}
