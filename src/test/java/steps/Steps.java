package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WebTablesPage;

import java.util.concurrent.TimeUnit;

public class Steps {

    public static ChromeDriver driver;

    public static ChromeDriver driver() {
        return driver;
    }

    @Given("^Me encuentro en la pagina de demoqa Web Tables$")
    public void meEncuentroEnLaPaginaDeDemoqaWebTables() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
    }


    @When("^Doy click al boton Web Tables de la lista desplegada$")
    public void doyClickAlBotonWebTablesDeLaListaDesplegada() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnWebTable();
    }

    @Then("^Visualizo el Web Tables$")
    public void visualizoElWebTables() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.visualizoWebTables();
    }

    @When("^Doy click al boton Add de la tabla de registro$")
    public void doyClickAlBotonAddDeLaListaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnAddTabla();
    }

    @And("^Ingreso datos de usuario en la tabla de registro$")
    public void ingresoDatosDeUsuarioEnLaTablaDeRegistro() {
       WebTablesPage webTablesPage = new WebTablesPage();
       webTablesPage.enviarDatosFormulario();
    }

    @And("^Doy click al boton Submit de la tabla de registro$")
    public void doyClickAlBotonSubmitDeLaTablaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnSubmitTabla();
    }

    @Then("^Visualizo el dato creado en la tabla de registros$")
    public void visualizoElDatoCreadoEnLaTablaDeRegistros() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.visualizoDatoCreado();
    }

    @When("^Doy click al boton Edit de la tabla de registro$")
    public void doyClickAlBotonEditDeLaTablaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnEditarTabla();
    }

    @And("^Cambio los datos del usuario de la tabla de registro$")
    public void cambioLosDatosDelUsuarioDeLaTablaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.cambioDatosDeUsuario();
    }

    @When("^Doy click al boton Eliminar de la tabla de registro$")
    public void doyClickAlBotonEliminarDeLaTablaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnEliminarDeLaTabla();
    }

    @Then("^Se elimina el usuario correctamente$")
    public void seEliminaElUsuarioCorrectamente() {

    }

    @And("^Doy click al boton Submit despues de editar tabla de registro$")
    public void doyClickAlBotonSubmitDespuesDeEditarTablaDeRegistro() {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickBtnSubmitTabla();
    }
}
