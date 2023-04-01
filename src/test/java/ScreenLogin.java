import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"email\"]")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement campoEmail;

    @AndroidFindBy(accessibility = "password")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement campoSenha;

    @AndroidFindBy(accessibility = "login-button")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement btnEntrar;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"address-button\"]/android.view.ViewGroup")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement selecionarEndereco;

    @AndroidFindBy(id = "android:id/button1")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement permitirLocalizacao;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store-list-item\"])[2]/android.view.ViewGroup[2]/android.widget.TextView")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement selecionarEstabelecimento;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"add-item-buttom\"])[2]/android.widget.ImageView")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement adicionarItemNoCarrinho;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open-cart-button\"]")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement abrirCarrinho;

    @AndroidFindBy(accessibility = "confirm-order-button")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement confirmarPedido;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Dinheiro\").instance(0))")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement selecionarFormaDePagamento;

    @AndroidFindBy(accessibility = "do-order-button")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement fazerPedido;

    @AndroidFindBy(accessibility = "order-sucess-txt")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement textPedidoRealizadoComSucesso;

    public void logar()throws InterruptedException{
        Thread.sleep(5000);
        campoEmail.sendKeys("teste@teste.com");
        campoSenha.sendKeys("123456");
        btnEntrar.click();
    }

    public void adicionarComprasNoCarrinho(){
        selecionarEndereco.click();
        permitirLocalizacao.click();
        selecionarEstabelecimento.click();
        adicionarItemNoCarrinho.click();
        abrirCarrinho.click();
        confirmarPedido.click();
        selecionarFormaDePagamento.isDisplayed();
        selecionarFormaDePagamento.click();
        fazerPedido.click();
        textPedidoRealizadoComSucesso.isDisplayed();

    }

}
