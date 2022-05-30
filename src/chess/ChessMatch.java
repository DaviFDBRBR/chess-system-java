package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}

	/*
	 * Devido ao desenvolvimento em camadas, n�o � poss�vel manipular a matriz de tipo Piece no pacote/camada chess.
	 * Ent�o se faz um downcast dos objetos da superclasse Piece, para ChessPiece, que � uma classe pass�vel de
	 * manipula��o na camada chess. O programa (dentro da camada chess) apenas ir� enxergar ChessPiece.
	*/
	public ChessPiece[][] getPieces() { 
		ChessPiece mat[][] = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
}
