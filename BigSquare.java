/*
  Main Big Square

*/
public class BigSquare{

    private SmallSquare[] _STTT;
    private SmallSquare _BTTT;
    private boolean _isOver;
    private char _winner;

    public BigSquare(){
	_STTT = new SmallSquare[9];
	for(int i = 0; i < 9; i++)
	    _STTT[i] = new SmallSquare();
	_BTTT = new SmallSquare();
	_isOver = false;
	_winner = '-';
    }

    public SmallSquare[] getSBoard(){
	return _STTT;
    }

    public SmallSquare getBBoard(){
	return _BTTT;
    }
    public boolean isOver(){
	return _isOver;
    }

    public char getWinner(){
	return _winner;
    }

    public SmallSquare getSquare(int index){
	return _STTT[index];
    }
    
    public void setWinner(char player){
	_isOver = true;
	_winner = player;
    }

    public void setBBoard(int index, char win){
	_BTTT.setSquare(index, win);
    }

    public void printBoard(){
	for(SmallSquare x : _STTT)
	    x.printBoard();
	
    }
}
