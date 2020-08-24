package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

 

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

 

public class AbrirNavegador implements Task{
    private PageObject page;
    
    public AbrirNavegador(PageObject page) {
        this.page = page;
    }
    @Step("{0} abrir navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        
    }


    public static AbrirNavegador on(PageObject page) {    
        return instrumented(AbrirNavegador.class, page);
     
    }
 

}