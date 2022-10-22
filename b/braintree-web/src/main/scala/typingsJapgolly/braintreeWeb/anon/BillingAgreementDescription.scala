package typingsJapgolly.braintreeWeb.anon

import typingsJapgolly.braintreeWeb.modulesPaypalMod.PayPalShippingAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAgreementDescription extends StObject {
  
  var amount: js.UndefOr[String | Double] = js.undefined
  
  var billingAgreementDescription: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var enableShippingAddress: js.UndefOr[Boolean] = js.undefined
  
  var flow: String
  
  var intent: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var offerCredit: js.UndefOr[Boolean] = js.undefined
  
  var shippingAddressEditable: js.UndefOr[Boolean] = js.undefined
  
  var shippingAddressOverride: js.UndefOr[PayPalShippingAddress] = js.undefined
  
  var useraction: js.UndefOr[String] = js.undefined
}
object BillingAgreementDescription {
  
  inline def apply(flow: String): BillingAgreementDescription = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAgreementDescription]
  }
  
  extension [Self <: BillingAgreementDescription](x: Self) {
    
    inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBillingAgreementDescription(value: String): Self = StObject.set(x, "billingAgreementDescription", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementDescriptionUndefined: Self = StObject.set(x, "billingAgreementDescription", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableShippingAddress(value: Boolean): Self = StObject.set(x, "enableShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setEnableShippingAddressUndefined: Self = StObject.set(x, "enableShippingAddress", js.undefined)
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOfferCredit(value: Boolean): Self = StObject.set(x, "offerCredit", value.asInstanceOf[js.Any])
    
    inline def setOfferCreditUndefined: Self = StObject.set(x, "offerCredit", js.undefined)
    
    inline def setShippingAddressEditable(value: Boolean): Self = StObject.set(x, "shippingAddressEditable", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressEditableUndefined: Self = StObject.set(x, "shippingAddressEditable", js.undefined)
    
    inline def setShippingAddressOverride(value: PayPalShippingAddress): Self = StObject.set(x, "shippingAddressOverride", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressOverrideUndefined: Self = StObject.set(x, "shippingAddressOverride", js.undefined)
    
    inline def setUseraction(value: String): Self = StObject.set(x, "useraction", value.asInstanceOf[js.Any])
    
    inline def setUseractionUndefined: Self = StObject.set(x, "useraction", js.undefined)
  }
}
