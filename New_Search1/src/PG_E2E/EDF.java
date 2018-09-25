package PG_E2E;

import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EDF {

 public  EDF(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
 
    @FindBy(xpath = "/html/body/header/nav/div[3]/button") 
	public WebElement onBoarding;
	
	@FindBy(xpath = "/html/body/header/nav/div[3]/div/a[4]")
	public WebElement DataAsset;
	
	@FindBy(xpath = "/html/body/main/div/div[2]/ul/li/a")
	public WebElement add ; 
	
	@FindBy(xpath = "/html/body/header/nav/div[3]/div/a[1]")
	public WebElement providers;
	
	
	
	@FindBy(id = "id_provider_name")
	public WebElement providername;
	
	@FindBy(id = "id_sf_account")
	public WebElement sfaccount;
	
	@FindBy(xpath = "/html/body/main/div/input")
	public WebElement Submit;
	
	// Data Asset
	
	@FindBy(xpath ="/html/body/main/div/div[2]/ul/li[3]")
	public WebElement DataAssetsTab;
	
	
	@FindBy(xpath ="/html/body/main/div/div[2]/div[3]/div/ul/li/a")
	public WebElement DataAssetsADD;
	
	@FindBy(id="id_data_asset_name")
	public WebElement id_data_asset_name;
	
	
	@FindBy(id="id_data_asset_type")
	public WebElement id_data_asset_type;
	
	@FindBy(name="name_space")
	public WebElement name_space;
	
	@FindBy(name="domain_name")
	public WebElement domain_name;
	
	@FindBy(name="line_of_business")
	public WebElement line_of_business;
	
	@FindBy(name="geography")
	public WebElement geography;
	
	@FindBy(name="source_channel")
	public WebElement source_channel;
	
	@FindBy(name="source_cadence")
	public WebElement source_cadence;
	
	@FindBy(name="source_frequency")
	public WebElement source_frequency;
	
	
	@FindBy(name="source_feed_type")
	public WebElement source_feed_type;
	
	@FindBy(name="source_score")
	public WebElement source_score;
	
	@FindBy(name="authoritative_score")
	public WebElement authoritative_score;
	
	@FindBy(name="relationship_type")
	public WebElement relationship_type;
	
	
	@FindBy(name="household_granularity")
	public WebElement household_granularity;
	
	
	@FindBy(name="phone_wire_type")
	public WebElement phone_wire_type;
	
	@FindBy(xpath = "/html/body/main/div/div[2]/table/tbody/tr[4]/td[2]/a")
	public WebElement TestingDA;
	
	@FindBy(name="alert_level")
	public WebElement alert_level;
	
	@FindBy(name="alert_poc")
	public WebElement alert_poc;
	
	@FindBy(xpath="/html/body/main/div/div/form/input[4]")
	public WebElement DataAsset_Submit;
	

	
	// Data Asset Format 
	
	@FindBy(xpath="/html/body/main/div/div[2]/ul/li[5]")
	public WebElement FormatsTab;
	
	@FindBy(xpath="/html/body/main/div/div[2]/div[5]/div/ul/li/a")
	public WebElement DAFormat;
	
	@FindBy(name="input_type")
	public WebElement Input_Type;
	
	
	@FindBy(name="output_type")
	public WebElement output_type;
	
	
	@FindBy(name="trfm")
	public WebElement trfm;
	
	@FindBy(name="flow")
	public WebElement flow;
	
	@FindBy(name="store")
	public WebElement store;
	
	@FindBy(name="store_load_flg")
	public WebElement store_load_flg;
	
	@FindBy(xpath="/html/body/main/div/div/form/input[5]")
	public WebElement DAFormatSubmit;
	
	@FindBy(name = "endpoint_source")
	public WebElement endpoint_source;
	
	@FindBy(name = "source_dir_name")
	public WebElement source_dir_name;
	
	@FindBy(name = "source_pattern")
	public WebElement source_pattern;
	
	@FindBy(name="endpoint_target")
	public WebElement endpoint_target;
	
	@FindBy(name="landing_dir_name")
	public WebElement landing_dir_name;
	
	
	
	@FindBy(xpath="/html/body/main/div/div[2]/div[3]/div/table/tbody/tr/td[1]/a")
	public WebElement End2EndDA;
	
	@FindBy(xpath="/html/body/main/div/div[2]/ul/li[5]")
	public WebElement FormatDATab;

	@FindBy(xpath="/html/body/main/div/div[2]/div[5]/div/ul/li/a")
	public WebElement DAFormatAdd;
	
	
	
	// EndPoint 
	@FindBy(xpath = "/html/body/header/nav/div[3]/div/a[2]")
	public WebElement  Endpoint_tab;
	
	
	@FindBy(name = "endpoint_name")
	public WebElement endpoint_name;
	
	
	@FindBy(name = "endpoint_type")
	public WebElement endpoint_type;
	
	@FindBy(name = "endpoint_ip")
	public WebElement endpoint_ip;
	
	@FindBy(name = "endpoint_dns")
	public WebElement endpoint_dns;
	
	@FindBy(name = "endpoint_port")
	public WebElement endpoint_port;
	
	@FindBy(name = "endpoint_username")
	public WebElement endpoint_username;
	
	
	@FindBy(name = "endpoint_pw")
	public WebElement endpoint_pw;
	
	
	@FindBy(name = "endpoint_default_path")
	public WebElement endpoint_default_path;
	
	
	@FindBy(name = "endpoint_cred_type")
	public WebElement endpoint_cred_type;
	
	@FindBy(name = "key_loc_path")
	public WebElement key_loc_path;
	
	
	@FindBy(name = "key_password")
	public WebElement key_password;
	
	@FindBy(name = "endpoint_flow_dir")
	public WebElement endpoint_flow_dir;
	
	@FindBy(name = "endpoint_method")
	public WebElement endpoint_method;
	
	// Schema
	
	@FindBy(xpath = "/html/body/header/nav/div[3]/div/a[7]")
	public WebElement Schema;
	
	@FindBy(xpath = "/html/body/main/div/div/form/input[1]")
	public WebElement Schema_Submit;
	
	
	
	// Transform
	
	
	
	
}
