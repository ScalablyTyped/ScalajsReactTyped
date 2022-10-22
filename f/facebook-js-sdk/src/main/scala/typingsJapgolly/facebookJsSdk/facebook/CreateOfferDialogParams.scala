package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.APP_INSTALLS
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.CONVERSIONS
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.LINK_CLICKS
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.OFFER_CLAIMS
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.PRODUCT_CATALOG_SALES
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.STORE_VISITS
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.create_offer
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOfferDialogParams
  extends StObject
     with DialogParams {
  
  var account_id: String
  
  @JSName("display")
  var display_CreateOfferDialogParams: popup
  
  var method: create_offer
  
  var objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS
  
  var page_id: String
}
object CreateOfferDialogParams {
  
  inline def apply(
    account_id: String,
    objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS,
    page_id: String
  ): CreateOfferDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = "popup", method = "create_offer", objective = objective.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
  
  extension [Self <: CreateOfferDialogParams](x: Self) {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: create_offer): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setObjective(
      value: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS
    ): Self = StObject.set(x, "objective", value.asInstanceOf[js.Any])
    
    inline def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
