package ui;

import net.serenitybdd.screenplay.targets.Target;

public class irAtarifario {
 public static final Target TARIFARIO = Target.the("link target").locatedBy("//*[@id='footer-content']/div[2]/div[1]/div/div[2]/div/ul/li[5]/a");
 public static final Target PDF = Target.the("link pdf").locatedBy("//*[@id='main-content']/div[1]/div/div/table/tbody/tr[3]/td[2]/span/a/img");
}
