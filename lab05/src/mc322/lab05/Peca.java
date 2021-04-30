package mc322.lab05;

public class Peca {
	String cor = "";
	int posLin = -1;
	int posCol = -1;
	
	Peca(String cor, int posLin, int posCol)
	{	
		this.cor = cor;
		this.posLin = posLin;
		this.posCol = posCol;
	}
	
	String verPeca()
	{
		return cor;
	}
	
	public boolean movimentaPeca(String trajeto, int linF, int colF)
	{
		boolean permissao = false;
		if(trajeto.equals("b-")) 				// Lance normal
			permissao = true;
		else if(trajeto.equals("bp-"))			// Come pe�a adversaria
			permissao = true;
		else if(trajeto.equals("p-"))			// Lance normal
			permissao = true;
		else if(trajeto.equals("pb-"))			// Come pe�a adversaria
			permissao = true;
		else
		{
			System.out.println("Pe�a n�o faz esse trajeto: " + trajeto);
		}
			
		if(permissao) 
		{
			posLin = linF;
			posCol = colF;	
		}		
		return permissao;
	}
}