package cop5556sp17.AST;

import cop5556sp17.Scanner.Token;

public class IdentChain extends ChainElem {

	public Dec dec;
	
	public IdentChain(Token firstToken) {
		super(firstToken);
	}


	@Override
	public String toString() {
		return "IdentChain [firstToken=" + firstToken + "]";
	}


	@Override
	public Object visit(ASTVisitor v, Object arg) throws Exception {
		return v.visitIdentChain(this, arg);
	}


	public void setDec(Dec dec2) {
		//  Auto-generated method stub
	    dec = dec2;		
	}
	public Dec getDec(){
		return dec;
	}


}