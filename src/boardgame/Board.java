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

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
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
	
	public Piece piece(int row, int column) {
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}
}
