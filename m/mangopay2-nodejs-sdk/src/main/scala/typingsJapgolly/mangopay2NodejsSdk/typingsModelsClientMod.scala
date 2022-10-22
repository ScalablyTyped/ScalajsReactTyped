package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsClientMod {
  
  object client {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    */
    trait BusinessType extends StObject
    object BusinessType {
      
      inline def CROWDFUNDING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING = "CROWDFUNDING".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING]
      
      inline def FRANCHISE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE = "FRANCHISE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE]
      
      inline def MARKETPLACE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = "MARKETPLACE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    }
    
    trait ClientData
      extends StObject
         with EntityBaseData {
      
      /**
        * A list of email addresses to use when contacting you for admin/commercial issues/communications
        */
      var AdminEmails: js.Array[String]
      
      /**
        * A list of email addresses to use when contacting you for billing issues/communications
        */
      var BillingEmails: js.Array[String]
      
      /**
        * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
        */
      var ClientId: String
      
      /**
        * Your unique MANGOPAY reference which you should use when contacting us
        */
      var CompanyReference: String
      
      /**
        * A list of email addresses to use when contacting you for fraud/compliance issues/communications
        */
      var FraudEmails: js.Array[String]
      
      /**
        * The address of the company’s headquarters
        */
      var HeadquartersAddress: AddressType
      
      /**
        * The phone number of the company's headquarters
        */
      var HeadquartersPhoneNumber: String
      
      /**
        * The URL of the logo of your client
        */
      var Logo: String
      
      /**
        * The pretty name for the client
        */
      var Name: String
      
      /**
        * The Categorization of your platform, in terms of Business Type and Sector
        */
      var PlatformCategorization: typingsJapgolly.mangopay2NodejsSdk.typingsModelsClientMod.client.PlatformCategorization
      
      /**
        * A description of what your platform does
        */
      var PlatformDescription: String
      
      /**
        * The URL for your website
        */
      var PlatformURL: String
      
      /**
        * The primary branding colour to use for buttons for your merchant
        */
      var PrimaryButtonColour: String
      
      /**
        * The primary branding colour to use for your merchant
        */
      var PrimaryThemeColour: String
      
      /**
        * The registered name of your company
        */
      var RegisteredName: String
      
      /**
        * The tax (or VAT) number for your company
        */
      var TaxNumber: String
      
      /**
        * A list of email addresses to use when contacting you for technical issues/communications
        */
      var TechEmails: js.Array[String]
    }
    object ClientData {
      
      inline def apply(
        AdminEmails: js.Array[String],
        BillingEmails: js.Array[String],
        ClientId: String,
        CompanyReference: String,
        CreationDate: Double,
        FraudEmails: js.Array[String],
        HeadquartersAddress: AddressType,
        HeadquartersPhoneNumber: String,
        Id: String,
        Logo: String,
        Name: String,
        PlatformCategorization: PlatformCategorization,
        PlatformDescription: String,
        PlatformURL: String,
        PrimaryButtonColour: String,
        PrimaryThemeColour: String,
        RegisteredName: String,
        Tag: String,
        TaxNumber: String,
        TechEmails: js.Array[String]
      ): ClientData = {
        val __obj = js.Dynamic.literal(AdminEmails = AdminEmails.asInstanceOf[js.Any], BillingEmails = BillingEmails.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], CompanyReference = CompanyReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], FraudEmails = FraudEmails.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], HeadquartersPhoneNumber = HeadquartersPhoneNumber.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Logo = Logo.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlatformCategorization = PlatformCategorization.asInstanceOf[js.Any], PlatformDescription = PlatformDescription.asInstanceOf[js.Any], PlatformURL = PlatformURL.asInstanceOf[js.Any], PrimaryButtonColour = PrimaryButtonColour.asInstanceOf[js.Any], PrimaryThemeColour = PrimaryThemeColour.asInstanceOf[js.Any], RegisteredName = RegisteredName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TaxNumber = TaxNumber.asInstanceOf[js.Any], TechEmails = TechEmails.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClientData]
      }
      
      extension [Self <: ClientData](x: Self) {
        
        inline def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
        
        inline def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value*))
        
        inline def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
        
        inline def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value*))
        
        inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
        
        inline def setCompanyReference(value: String): Self = StObject.set(x, "CompanyReference", value.asInstanceOf[js.Any])
        
        inline def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
        
        inline def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value*))
        
        inline def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
        
        inline def setHeadquartersPhoneNumber(value: String): Self = StObject.set(x, "HeadquartersPhoneNumber", value.asInstanceOf[js.Any])
        
        inline def setLogo(value: String): Self = StObject.set(x, "Logo", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
        
        inline def setPlatformCategorization(value: PlatformCategorization): Self = StObject.set(x, "PlatformCategorization", value.asInstanceOf[js.Any])
        
        inline def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
        
        inline def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
        
        inline def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
        
        inline def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
        
        inline def setRegisteredName(value: String): Self = StObject.set(x, "RegisteredName", value.asInstanceOf[js.Any])
        
        inline def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
        
        inline def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
        
        inline def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value*))
      }
    }
    
    trait PlatformCategorization extends StObject {
      
      var BusinessType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsClientMod.client.BusinessType
      
      var Sector: typingsJapgolly.mangopay2NodejsSdk.typingsModelsClientMod.client.Sector
    }
    object PlatformCategorization {
      
      inline def apply(BusinessType: BusinessType, Sector: Sector): PlatformCategorization = {
        val __obj = js.Dynamic.literal(BusinessType = BusinessType.asInstanceOf[js.Any], Sector = Sector.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlatformCategorization]
      }
      
      extension [Self <: PlatformCategorization](x: Self) {
        
        inline def setBusinessType(value: BusinessType): Self = StObject.set(x, "BusinessType", value.asInstanceOf[js.Any])
        
        inline def setSector(value: Sector): Self = StObject.set(x, "Sector", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/enums.enums.IPlatformType> */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
    */
    trait PlatformType extends StObject
    object PlatformType {
      
      inline def CROWDFUNDING_DONATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION = "CROWDFUNDING_DONATION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION]
      
      inline def CROWDFUNDING_EQUITY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY = "CROWDFUNDING_EQUITY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY]
      
      inline def CROWDFUNDING_LOAN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN = "CROWDFUNDING_LOAN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN]
      
      inline def CROWDFUNDING_REWARD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD = "CROWDFUNDING_REWARD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD]
      
      inline def MARKETPLACE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = "MARKETPLACE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE]
      
      inline def NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = "NotSpecified".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
      
      inline def P2P_PAYMENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT = "P2P_PAYMENT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LOAN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EQUITY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PROPERTY_EQUITY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REWARDS_CHARITY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POOL_GROUP_PAYMENT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE_
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER_
    */
    trait Sector extends StObject
    object Sector {
      
      inline def ART_MUSIC_ENTERTAINMENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT = "ART_MUSIC_ENTERTAINMENT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT]
      
      inline def BEAUTY_COSMETICS_HEALTH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH = "BEAUTY_COSMETICS_HEALTH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH]
      
      inline def EQUITY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EQUITY = "EQUITY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EQUITY]
      
      inline def FOOD_WINE_RESTAURANTS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS = "FOOD_WINE_RESTAURANTS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS]
      
      inline def FRANCHISE_ : typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE_ = "FRANCHISE_".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE_]
      
      inline def FURNITURE_GARDEN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN = "FURNITURE_GARDEN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN]
      
      inline def HOSPITALITY_TRAVEL_CORIDING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING = "HOSPITALITY_TRAVEL_CORIDING".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING]
      
      inline def LOAN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LOAN = "LOAN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LOAN]
      
      inline def OTHER_ : typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER_ = "OTHER_".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER_]
      
      inline def POOL_GROUP_PAYMENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POOL_GROUP_PAYMENT = "POOL_GROUP_PAYMENT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POOL_GROUP_PAYMENT]
      
      inline def PROPERTY_EQUITY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PROPERTY_EQUITY = "PROPERTY_EQUITY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PROPERTY_EQUITY]
      
      inline def RENTALS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS = "RENTALS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS]
      
      inline def REWARDS_CHARITY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REWARDS_CHARITY = "REWARDS_CHARITY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REWARDS_CHARITY]
      
      inline def SERVICES_JOBBING_EDUCATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION = "SERVICES_JOBBING_EDUCATION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION]
      
      inline def SPORT_RECREATION_ACTIVITIES: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES = "SPORT_RECREATION_ACTIVITIES".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES]
      
      inline def STORES_FASHION_ACCESSORIES_OBJECTS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS = "STORES_FASHION_ACCESSORIES_OBJECTS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS]
      
      inline def TICKETING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING = "TICKETING".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING]
    }
    
    trait UpdateClient extends StObject {
      
      /**
        * A list of email addresses to use when contacting you for admin/commercial issues/communications
        */
      var AdminEmails: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A list of email addresses to use when contacting you for billing issues/communications
        */
      var BillingEmails: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A list of email addresses to use when contacting you for fraud/compliance issues/communications
        */
      var FraudEmails: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The address of the company’s headquarters
        */
      var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
      
      /**
        * A description of what your platform does
        */
      var PlatformDescription: js.UndefOr[String] = js.undefined
      
      /**
        * The type of platform
        */
      var PlatformType: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsClientMod.client.PlatformType] = js.undefined
      
      /**
        * The URL for your website
        */
      var PlatformURL: js.UndefOr[String] = js.undefined
      
      /**
        * The primary branding colour to use for buttons for your merchant
        */
      var PrimaryButtonColour: js.UndefOr[String] = js.undefined
      
      /**
        * The primary branding colour to use for your merchant
        */
      var PrimaryThemeColour: js.UndefOr[String] = js.undefined
      
      /**
        * The tax (or VAT) number for your company
        */
      var TaxNumber: js.UndefOr[String] = js.undefined
      
      /**
        * A list of email addresses to use when contacting you for technical issues/communications
        */
      var TechEmails: js.UndefOr[js.Array[String]] = js.undefined
    }
    object UpdateClient {
      
      inline def apply(): UpdateClient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateClient]
      }
      
      extension [Self <: UpdateClient](x: Self) {
        
        inline def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
        
        inline def setAdminEmailsUndefined: Self = StObject.set(x, "AdminEmails", js.undefined)
        
        inline def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value*))
        
        inline def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
        
        inline def setBillingEmailsUndefined: Self = StObject.set(x, "BillingEmails", js.undefined)
        
        inline def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value*))
        
        inline def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
        
        inline def setFraudEmailsUndefined: Self = StObject.set(x, "FraudEmails", js.undefined)
        
        inline def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value*))
        
        inline def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
        
        inline def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
        
        inline def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
        
        inline def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
        
        inline def setPlatformType(value: PlatformType): Self = StObject.set(x, "PlatformType", value.asInstanceOf[js.Any])
        
        inline def setPlatformTypeUndefined: Self = StObject.set(x, "PlatformType", js.undefined)
        
        inline def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
        
        inline def setPlatformURLUndefined: Self = StObject.set(x, "PlatformURL", js.undefined)
        
        inline def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
        
        inline def setPrimaryButtonColourUndefined: Self = StObject.set(x, "PrimaryButtonColour", js.undefined)
        
        inline def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
        
        inline def setPrimaryThemeColourUndefined: Self = StObject.set(x, "PrimaryThemeColour", js.undefined)
        
        inline def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
        
        inline def setTaxNumberUndefined: Self = StObject.set(x, "TaxNumber", js.undefined)
        
        inline def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
        
        inline def setTechEmailsUndefined: Self = StObject.set(x, "TechEmails", js.undefined)
        
        inline def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value*))
      }
    }
    
    trait UpdateClientLogo extends StObject {
      
      /**
        * The base64 encoded file which needs to be uploaded
        */
      var File: String
    }
    object UpdateClientLogo {
      
      inline def apply(File: String): UpdateClientLogo = {
        val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateClientLogo]
      }
      
      extension [Self <: UpdateClientLogo](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
      }
    }
  }
}
