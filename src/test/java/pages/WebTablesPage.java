package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.Steps;

import java.util.concurrent.TimeUnit;

public class WebTablesPage {

    @FindBy(xpath = "//span[contains(text(),'Web Tables')]")
    private WebElement btnWebtables;

    //visualizar data tables
    @FindBy(xpath = "//div[3]/div[1]/div[2]/div[1]/div")
    private WebElement datoCierra;
    @FindBy(xpath = "//div[3]/div[1]/div[2]/div[2]/div")
    private WebElement datoAlden;
    @FindBy(xpath = "//div[3]/div[1]/div[2]/div[3]/div")
    private WebElement datoKierra;

    //add table user
    @FindBy(id = "addNewRecordButton")
    private WebElement btnAdd;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;

    //edit
    @FindBy(id = "edit-record-1")
    private WebElement btnEdit;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]")
    private WebElement usuario;
    //delete
    @FindBy(id = "delete-record-1")
    private WebElement btnDelete;


    // Enviar datos formulario
    @FindBy(id = "firstName")
    private WebElement inputFirstName;
    @FindBy(id = "lastName")
    private WebElement inputLastName;
    @FindBy(id = "userEmail")
    private WebElement inputUserEmail;
    @FindBy(id = "age")
    private WebElement inputAge;
    @FindBy(id = "salary")
    private WebElement inputSalary;
    @FindBy(id = "department")
    private WebElement inputDepartment;

    public static ChromeDriver driver;

    public WebTablesPage() {
        ChromeDriver driver = Steps.driver();
        PageFactory.initElements(driver, this);


//
    }

    public void clickBtnWebTable() {
        btnWebtables.click();
    }

    public void visualizoWebTables() {
        System.out.format("primer usuario: "+datoCierra.getText() +"\n"+ "Segundo usuario: "+ datoAlden.getText() +"\n"+ "Tercer usuario: "+datoKierra.getText() +"\n");
    }

    public void enviarDatosFormulario() {
        inputFirstName.sendKeys("Alvaro");
        inputLastName.sendKeys("Escalona");
        inputUserEmail.sendKeys("alvaroescalona@gmail.com");
        inputAge.sendKeys("25");
        inputSalary.sendKeys("90203");
        inputDepartment.sendKeys("devQa");
    }

    public void clickBtnAddTabla() {
        btnAdd.click();
    }

    public void clickBtnSubmitTabla() {
        btnSubmit.click();
    }

    public void visualizoDatoCreado() {
        Assert.assertEquals(true, usuario.isDisplayed());
    }

    public void clickBtnEditarTabla() {
        btnEdit.click();
    }

    public void cambioDatosDeUsuario() {
        inputFirstName.clear();
        inputFirstName.sendKeys("Jorge");
        inputLastName.clear();
        inputLastName.sendKeys("Salas");
        inputUserEmail.clear();
        inputUserEmail.sendKeys("jorgesa@gmail.com");
        inputAge.clear();
        inputAge.sendKeys("30");
        inputSalary.clear();
        inputSalary.sendKeys("12321");
        inputDepartment.clear();
        inputDepartment.sendKeys("Cyber");
    }

    public void clickBtnEliminarDeLaTabla() {
        System.out.println("Eliminaremos al usuario: "+datoCierra.getText());
        if (btnDelete.isDisplayed()) {
            btnDelete.click();
            System.out.println("El usuario ha sido eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el usuario: "+datoCierra.getText());
        }
    }


}