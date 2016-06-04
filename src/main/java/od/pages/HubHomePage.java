package od.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class HubHomePage extends PageObject {

    //-----Main Menu ----//

    @FindBy(xpath = "*//a[@class=\"navbar-brand\" and contains(text(), \"Subutai Hub\")]")
    public WebElementFacade pageHomeLinkSubutaiHub;

    @FindBy(xpath = "*//a[@class=\"dropdown-toggle\" and contains (text(), \"Peers\")]")
    public WebElementFacade pageHomeMenuPeers;

    @FindBy(xpath = "*//ul[@class=\"dropdown-menu animated fadeInDown\"]//a[contains (text(), \"Peers\")]")
    public WebElementFacade pageHomeDropdownMenuPeers;

    @FindBy(xpath = "*//ul[@class=\"dropdown-menu animated fadeInDown\"]//a[contains (text(), \"Resource Hosts\")]")
    public WebElementFacade pageHomeDropdownMenuResourceHosts;

    @FindBy(xpath = "*//ul[@class=\"dropdown-menu animated fadeInDown\"]//a[contains (text(), \"Peer globe map\")]")
    public WebElementFacade pageHomeDropdownMenuPeerGlobeMap;

    @FindBy(xpath = "*//a[@class=\"dropdown-toggle\" and contains (text(), \"Users\")]")
    public WebElementFacade pageHomeMenuUsers;

    @FindBy(xpath = "*//ul[@class=\"dropdown-menu animated fadeInDown\"]//a[contains (text(), \"Users\")]")
    public WebElementFacade pageHomeDropdownMenuUsers;

    @FindBy(xpath = "*//ul[@class=\"dropdown-menu animated fadeInDown\"]//a[contains (text(), \"Organizations\")]")
    public WebElementFacade pageHomeDropdownMenuOrganizations;

    @FindBy(xpath = "*//a[contains (text(), \"Bazaar\")]")
    public WebElementFacade pageHomeMenuBazaar;

    @FindBy(xpath = "*//i[@class=\"fa fa-bell\"]")
    public WebElementFacade pageHomeFaFaBell;

    @FindBy(xpath = "*//i[@class=\"fa fa-user\"]")
    public WebElementFacade pageHomeFaFaUser;

    @FindBy(xpath = "*//a[contains(text(), \"Admin\")]")
    public WebElementFacade pageHomeMenuUserProfile;

    @FindBy(xpath = "*//ol[@class=\"breadcrumb\"]//strong[contains(text(), \"Home\")]")
    public WebElementFacade pageHomeTextHome;

    @FindBy(xpath = "*//div[@class=\"footer\"]")
    public WebElementFacade pageHomeFooter;

    @FindBy(xpath = "*//div[@class=\"footer\"]//div[contains(text(),\"Social Hub for Social Cloud\")]")
    public WebElementFacade pageHomeFooterSocialHubForSocialCloud;

    @FindBy(xpath = "*//div[@class=\"footer\"]//div[contains(text(),\"Critical Factor © 2014-2015\")]")
    public WebElementFacade pageHomeFooterCriticalFactor;

    @FindBy(xpath = "*//div[@class=\"footer\"]//a[contains(text(),\"About\")]")
    public WebElementFacade pageHomeFooterAbout;

    //------Menu Peers-------//
    @FindBy(xpath = "*//ol[@class=\"breadcrumb\"]//a[contains(text(), \"Home\")]")
    public WebElementFacade pagePeersLinkHome;

    @FindBy(xpath = "*//ol[@class=\"breadcrumb\"]//strong[contains(text(), \"Peers\")]")
    public WebElementFacade pagePeersTextPeers;

    @FindBy(xpath = "*//li[@class=\"search-field\"]//input[@value=\"Select country...\"]/..")
    public WebElementFacade pagePeersSearchFieldFilterByCountries;

    @FindBy(xpath = "*//tr[@role=\"row\"]")
    public WebElementFacade pagePeersTablePeers;

    @FindBy(xpath = "*//tr[@role=\"row\"]//th[contains(text(), \"Country\")]")
    public WebElementFacade pagePeersColoumnTitleItemCountry;

    @FindBy(xpath = "*//tr[@role=\"row\"]//th[contains(text(), \"Status\")]")
    public WebElementFacade pagePeersColoumnTitleItemStatus;

    @FindBy(xpath = "*//tr[@role=\"row\"]//th[contains(text(), \"Name / ID\")]")
    public WebElementFacade pagePeersColoumnTitleItemNameID;

    @FindBy(xpath = "*//tr[@role=\"row\"]//th[contains(text(), \"Resource Hosts\")]")
    public WebElementFacade pagePeersColoumnTitleItemResourceHosts;

    @FindBy(id ="peers-datatable_info")
    public WebElementFacade pagePeersInfoDataTable;

    @FindBy(xpath = "*//div[@id=\"peers-datatable_info\" and contains(text(), \"entries\")]")
    public WebElementFacade pagePeersInfoShowingPages;

    @FindBy(xpath = "*//div[@id=\"peers-datatable_paginate\"]")
    public WebElementFacade pagePeersPaginationButtons;

    @FindBy(xpath = "*//li[@id=\"peers-datatable_previous\"]//a[contains(text(),\"Previous\")]")
    public WebElementFacade pagePeersPaginationButtonsPrevious;

    @FindBy(xpath = "*//li[@id=\"peers-datatable_next\"]//a[contains(text(),\"Next\")]")
    public WebElementFacade pagePeersPaginationButtonsNext;

    @FindBy(xpath = "*//a[contains(text(),\"Subutai Management Console\")]")
    public WebElementFacade pagePeersLinkSubutaiManagmentConsol;

    @FindBy(xpath = "*//div[@class=\"col-lg-12\"and contains(text(),\"To show your own peer here, open\")]//strong[contains(text(),\"Register to Hub\")]")
    public WebElementFacade pagePeersTextDownInfo;

    @FindBy(xpath = "*//ol[@class=\"breadcrumb\"]//strong[contains(text(), \"Resource Hosts\")]")
    public WebElementFacade pageResourceHostsTextResourceHosts;

    @FindBy(xpath = "*//div[@class=\"ibox-content\"]")
    public WebElementFacade pageResourceLeftMenuesField;

    @FindBy(xpath = "*//label[@class=\"font-bold m-t-sm\" and contains(text(),\"Peer Country\")]")
    public WebElementFacade pageResourceTextPeerCountry;

    @FindBy(xpath = "*//div[@id='peer_countries_chosen']/ul")
    public WebElementFacade pageResourceSelectPeerCountry;

    @FindBy(xpath = "*//label[@class=\"font-bold m-t-sm\" and contains(text(),\"CPU Model\")]")
    public WebElementFacade pageResourceTextCPUModel;

    @FindBy(xpath = "*//div[@id='cpu_models_chosen']/ul")
    public WebElementFacade pageResourceSelectCPUModel;

    @FindBy(xpath = "*//div[@ class=\"font-bold m-t-sm\"and contains(text(),\"CPU Instruction Sets\")]")
    public WebElementFacade pageResourceTextCPUInstructionSets;

    @FindBy(xpath = "*//span[@ class=\"checkbox checkbox-info checkbox-inline\"]//label[contains(text(),\"32 bit\")]")
    public WebElementFacade pageResource32BitCheckBoxWithText;

    @FindBy(xpath = "*//span[@ class=\"checkbox checkbox-info checkbox-inline\"]//label[contains(text(),\"64 bit\")]")
    public WebElementFacade pageResource64BitCheckBoxWithText;

    @FindBy(xpath = "*//div[@ class=\"font-bold m-t-sm\"and contains(text(),\"CPU Core Count\")]")
    public WebElementFacade pageResourceTextCPUCoreCount;

    @FindBy(xpath = "*//span[@class=\"irs js-irs-0 irs-with-grid\"]")
    public WebElementFacade pageResourceIrsCPUCoreCount;

    @FindBy(xpath = "*//div[@class=\"font-bold m-t-sm\" and contains(text(),\"Memory:\")]")
    public WebElementFacade pageResourceTextMemorySize;

    @FindBy(xpath = "*//span[@class=\"irs js-irs-0 irs-with-grid\"]//span[@class=\"irs-bar\"]")
    public WebElementFacade pageResourceIrsMemorySize;

    @FindBy(xpath = "*//div[@class=\"font-bold m-t-sm\"and contains(text(),\"Disk:\")]")
    public WebElementFacade pageResourceTextDiskSize;

    @FindBy(xpath = "*//span[@class=\"irs js-irs-1 irs-with-grid\"]//span[@class=\"irs-bar\"]")
    public WebElementFacade pageResourceIrsDiskSize ;

    @FindBy(xpath = "*//button[@class=\"btn btn-xs btn-primary filter-option-box-search-btn\" and contains(text(),\"Search\")]")
    public WebElementFacade pageResourceButtonSearchWithText;

    @FindBy(xpath = "*//table[@id=\"resourcehost_datatable\"]")
    public WebElementFacade pageResourceTableInCentre;

    @FindBy(xpath = "*//th[@class=\"sorting_asc\" and contains(text(),\"Country\")]")
    public WebElementFacade pageResourceColumnInTableCountry;

    @FindBy(xpath = "*//th[@class=\"text-center sorting\" and contains(text(),\"Status\")]")
    public WebElementFacade pageResourceColumnInTableStatus;

    @FindBy(xpath = "*//th[contains(text(), \"Name / ID\")]")
    public WebElementFacade pageResourceColumnInTableNameID;

    @FindBy(xpath = "*//th[@class=\"sorting\" and contains(text(),\"CPU\")]")
    public WebElementFacade pageResourceColumnInTableCPU;

    @FindBy(xpath = "*//th[@class=\"sorting\" and contains(text(),\"Memory\")]")
    public WebElementFacade pageResourceColumnInTableMemory;

    @FindBy(xpath = "*//th[@class=\"sorting\" and contains(text(),\"Disk\")]")
    public WebElementFacade pageResourceColumnInTableDisk;

    @FindBy(xpath = "*//th[@class=\"text-center sorting\" and contains(text(),\"Containers\")]")
    public WebElementFacade pageResourceColumnInTableContainers;

    @FindBy(xpath = "*//td[@class=\"dataTables_empty\" and contains(text(),\"No data available in table\")]")
    public WebElementFacade pageResourceTableEmptyFieldWithText;

    @FindBy(xpath = "*//button[@class=\"btn btn-xs btn-primary filter-option-box-showall-btn\"  and contains(text(),\"Clear\")]")
    public WebElementFacade pagePeersButtonClear;

    @FindBy(xpath = "*//div[@id=\"resourcehost_datatable_info\"]//strong[contains(text(),\"Total\")]")
    public WebElementFacade pagePeersTextTotal;


    //-----Peer globe map-----//

    @FindBy(xpath = "*//i[@class=\"b-icon-nav b-icon-nav_warroom\"]")
    public WebElementFacade iconWarRoom;


    //-------Not Already Done-----//



    //------Login as and LogOut------//

    @FindBy(xpath = "*//a[contains(text(),\"Login as\")]")
    public WebElementFacade pageHomeLinkOnLoginAs;

    @FindBy(xpath = "*//a[contains(text(),\"Logout\")]")
    public WebElementFacade pageHomeLinkOnLogout;

    @FindBy(xpath = "*//h4[contains(text(),\"Login as\")]")
    public WebElementFacade menuLoginAsHeaderText;

    @FindBy(xpath = "*//label[contains(text(),\"Enter user email\")]")
    public WebElementFacade menuLoginAsEnterUserEmailText;

    @FindBy(xpath = ".//*[@id='email']")
    public WebElementFacade menuLoginAsEnterUserEmailField;

    @FindBy(xpath = "*//button[contains(text(),\"Login\")]")
    public WebElementFacade menuLoginAsLoginButton;

    @FindBy(xpath = "*//button[contains(text(),\"Cancel\")]")
    public WebElementFacade menuLoginAsCancelButton;

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

    public List<String> getHeadersH3() {
        WebElementFacade HeadersList = find(By.tagName("div"));
        List<WebElement> results = HeadersList.findElements(By.tagName("h3"));
        return convert(results, toStrings());
    }

    public List<String> getHomeLink() {
        WebElementFacade LinksList = find(By.tagName("div"));
        List<WebElement> results = LinksList.findElements(By.className("navbar-brand"));
        return convert(results, toStrings());
    }

    public List<String> getMainMenuItems(){
        WebElementFacade LabelsList = find(By.tagName("div"));
        List<WebElement> results = LabelsList.findElements(By.className("dropdown-toggle  "));
        return convert(results, toStrings());
    }
}