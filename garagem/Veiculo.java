package garagem;

class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String exibirDetalhes(){

        return "Marca:" + marca + "\nModelo" + modelo + "\nano" + ano;
    }
}
class Carro extends Veiculo {

    private Integer NumeroDePortas;

    public Carro(Integer NumeroDePortas, String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
        this.NumeroDePortas = NumeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return NumeroDePortas;
    }

    public void setNumeroDePortas(Integer NumeroDePortas) {
        this.NumeroDePortas = NumeroDePortas;
    }
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes() + "Numero de portas" + NumeroDePortas;
    }
}
class Moto extends Veiculo{
    private String tipoGuidao; 

    public Moto(String tipoGuidao, String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes() + "Tipo de Guidão:" + tipoGuidao;
    }
}
