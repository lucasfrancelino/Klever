package steps;

import config.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;
import pages.FiltroPage;

public class FiltroSteps extends BaseTest {

    FiltroPage filtroPage= new FiltroPage();


    @Dado("que eu acesso a tela home do sistema da Klever")
    public void que_eu_acesso_a_tela_home_do_sistema_da_klever() {
        abrirBrowser();

    }
    @Quando("click no menu")
    public void click_no_menu() {
        filtroPage.acessoMenu();
    }
    @Quando("seleciono “Markets”")
    public void seleciono_markets() {
        filtroPage.selecionoOpcaoMarkets();
    }
    @Entao("posso buscar pelo campo {string}}")
    public void posso_buscar_pelo_campo(String pesquisa) {
        filtroPage.pesquisoOsPares(pesquisa);
    }
    @Entao("posso selecionar o filtro por BNB")
    public void posso_selecionar_o_filtro_por_bnb(String favorito) {
        filtroPage.selecionoFavorito(favorito);
    }



}
