package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalLegacySettings extends StObject {
  
  /**
    * The three-letter
    * [ISO 4217][ISO4217] currency code for the payment.
    *
    * For example:
    *
    * * AUD Australian dollar
    * * CAD Canadian dollar
    * * EUR Euro
    * * GBP Great Britain pound
    * * USD United States dollar
    *
    * This is a read-only property.
    *
    * [ISO4217]:          https://en.wikipedia.org/wiki/ISO_4217
    *
    */
  var currency: js.UndefOr[String] = js.undefined
  
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
}
object PayPalLegacySettings {
  
  inline def apply(): PayPalLegacySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayPalLegacySettings]
  }
  
  extension [Self <: PayPalLegacySettings](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
