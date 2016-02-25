public class LivroFisico extends Livro {

  public LivroFisico(Autor autor) {
    super(autor);
  }

  @Override
  public boolean aplicaDescontoDe(double porcentagem) {
    if (porcentagem > 0.3) {
			return false;
		}
    double desconto = getValor() * porcentagem;
    setValor(getValor() - desconto);
    System.out.println("Aplicando desconto no LivroFisico");
    return true;
  }
  
  public double getTaxaImpressao() {
    return getValor() * 0.05;
  }

}