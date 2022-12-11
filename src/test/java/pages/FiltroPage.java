package pages;

import config.BaseTest;
import elements.FiltroElementMap;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;

public class FiltroPage extends FiltroElementMap {

    public FiltroPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void acessoMenu() {
        menu.click();
    }

    public void selecionoOpcaoMarkets() {
        markets.click();
    }

    public void pesquisoOsPares(String pesquisa) {
        campoBusca.clear();
        campoBusca.sendKeys(pesquisa);
    }

    public void selecionoFavorito(String favorito) {
        favorite.click();
        BNB.click();
    }
}
