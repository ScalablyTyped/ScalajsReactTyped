package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3GooglePaymentOption extends StObject {
  
  /**
    * This JSON blob captures the specification for how Google facilitates
    * the payment for integrators, which is the PaymentDataRequest object
    * as defined in
    * https://developers.google.com/pay/api/web/reference/object#PaymentDataRequest
    * Example:
    *  {
    *  \"apiVersion\": 2,
    *  \"apiVersionMinor\": 0,
    *  \"merchantInfo\": {
    *    \"merchantName\": \"Example Merchant\"
    *  },
    *  \"allowedPaymentMethods\": [
    *    {
    *    \"type\": \"CARD\",
    *    \"parameters\": {
    *      \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],
    *      \"allowedCardNetworks\": [\"AMEX\", \"DISCOVER\", \"JCB\",
    * \"MASTERCARD\",
    *      \"VISA\"]
    *    },
    *    \"tokenizationSpecification\": {
    *      \"type\": \"PAYMENT_GATEWAY\",
    *      \"parameters\": {
    *      \"gateway\": \"example\",
    *      \"gatewayMerchantId\": \"exampleGatewayMerchantId\"
    *      }
    *    }
    *    }
    *  ],
    *  \"transactionInfo\": {
    *    \"totalPriceStatus\": \"ESTIMATED\",
    *    \"totalPrice\": \"12.34\",
    *    \"currencyCode\": \"USD\"
    *  }
    *  }
    */
  var facilitationSpec: js.UndefOr[String] = js.undefined
}
object GoogleActionsTransactionsV3GooglePaymentOption {
  
  inline def apply(): GoogleActionsTransactionsV3GooglePaymentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3GooglePaymentOption]
  }
  
  extension [Self <: GoogleActionsTransactionsV3GooglePaymentOption](x: Self) {
    
    inline def setFacilitationSpec(value: String): Self = StObject.set(x, "facilitationSpec", value.asInstanceOf[js.Any])
    
    inline def setFacilitationSpecUndefined: Self = StObject.set(x, "facilitationSpec", js.undefined)
  }
}
