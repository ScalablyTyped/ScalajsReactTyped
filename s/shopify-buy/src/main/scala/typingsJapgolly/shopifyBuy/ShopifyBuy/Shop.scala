package typingsJapgolly.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shop extends StObject {
  
  var description: String
  
  var moneyFormat: String
  
  var name: String
  
  /**
    * TODO Add types for the Shop properties below
    * PaymentSettings, ShopPolicy etc
    */
  var paymentSettings: Any
  
  var primaryDomain: Any
  
  var privacyPolicy: Any
  
  var refundPolicy: Any
  
  var termsOfService: Any
}
object Shop {
  
  inline def apply(
    description: String,
    moneyFormat: String,
    name: String,
    paymentSettings: Any,
    primaryDomain: Any,
    privacyPolicy: Any,
    refundPolicy: Any,
    termsOfService: Any
  ): Shop = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], privacyPolicy = privacyPolicy.asInstanceOf[js.Any], refundPolicy = refundPolicy.asInstanceOf[js.Any], termsOfService = termsOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
  
  extension [Self <: Shop](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMoneyFormat(value: String): Self = StObject.set(x, "moneyFormat", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: Any): Self = StObject.set(x, "paymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDomain(value: Any): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicy(value: Any): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
    
    inline def setRefundPolicy(value: Any): Self = StObject.set(x, "refundPolicy", value.asInstanceOf[js.Any])
    
    inline def setTermsOfService(value: Any): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
  }
}
