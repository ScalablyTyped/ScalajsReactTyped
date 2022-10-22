package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsCardMod {
  
  object card {
    
    trait CardData
      extends StObject
         with EntityBaseData {
      
      /**
        * Whether the card is active or not
        */
      var Active: Boolean
      
      /**
        * A partially obfuscated version of the credit card number
        */
      var Alias: String
      
      /**
        * The bank code
        */
      var BankCode: String
      
      /**
        * The provider of the card
        */
      var CardProvider: String
      
      /**
        * The type of card
        */
      var CardType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardMod.card.CardType
      
      /**
        * The Country of the Address
        */
      var Country: String
      
      /**
        * The currency - should be ISO_4217 format
        */
      var Currency: CurrencyISO
      
      /**
        * The expiry date of the card - must be in format MMYY
        */
      var ExpirationDate: String
      
      /**
        * A unique representation of a 16-digits card number
        */
      var Fingerprint: String
      
      /**
        * The card product type - more info
        */
      var Product: String
      
      /**
        * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
        * If they didn’t process a payment yet the "Validity" stay at "unknown".
        */
      var Validity: CardValidity
    }
    object CardData {
      
      inline def apply(
        Active: Boolean,
        Alias: String,
        BankCode: String,
        CardProvider: String,
        CardType: CardType,
        Country: String,
        CreationDate: Double,
        Currency: CurrencyISO,
        ExpirationDate: String,
        Fingerprint: String,
        Id: String,
        Product: String,
        Tag: String,
        Validity: CardValidity
      ): CardData = {
        val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], BankCode = BankCode.asInstanceOf[js.Any], CardProvider = CardProvider.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Fingerprint = Fingerprint.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
        __obj.asInstanceOf[CardData]
      }
      
      extension [Self <: CardData](x: Self) {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
        
        inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
        
        inline def setBankCode(value: String): Self = StObject.set(x, "BankCode", value.asInstanceOf[js.Any])
        
        inline def setCardProvider(value: String): Self = StObject.set(x, "CardProvider", value.asInstanceOf[js.Any])
        
        inline def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
        
        inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
        
        inline def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
        
        inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
        
        inline def setValidity(value: CardValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR
    */
    trait CardStatus extends StObject
    object CardStatus {
      
      inline def CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def ERROR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR]
      
      inline def VALIDATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB
    */
    trait CardType extends StObject
    object CardType {
      
      inline def BCMC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC = "BCMC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC]
      
      inline def CB_VISA_MASTERCARD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD = "CB_VISA_MASTERCARD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD]
      
      inline def DINERS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS = "DINERS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS]
      
      inline def IDEAL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL = "IDEAL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL]
      
      inline def MAESTRO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO = "MAESTRO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO]
      
      inline def MASTERPASS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS = "MASTERPASS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS]
      
      inline def P24: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24 = "P24".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24]
      
      inline def PAYLIB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB = "PAYLIB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
    */
    trait CardValidity extends StObject
    object CardValidity {
      
      inline def INVALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = "INVALID".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID]
      
      inline def UNKNOWN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
      
      inline def VALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = "VALID".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID]
    }
    
    trait UpdateCard extends StObject {
      
      var Active: js.UndefOr[`false`] = js.undefined
      
      var Id: String
    }
    object UpdateCard {
      
      inline def apply(Id: String): UpdateCard = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateCard]
      }
      
      extension [Self <: UpdateCard](x: Self) {
        
        inline def setActive(value: `false`): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
        
        inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      }
    }
  }
}
