package boardgame;

public class Board {
	
	private int rows;
	private int column;
	private Piece[][] pieces;
	
	public Board(int rows, int column) {
		this.rows = rows;
		this.column = column;
		this.pieces = new Piece[this.rows][this.column];
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
}
