package typingsJapgolly.googlepay.google.payments.api

import typingsJapgolly.googlepay.googlepayBooleans.`false`
import typingsJapgolly.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a user's ability to provide payment information
  * through the Google Pay payment sheet.
  *
  * @example
  * ```
  * // The current user is able to provide payment
  * // information through the Google Pay payment sheet.
  * {
  *   "result": true
  * }
  * ```
  */
trait IsReadyToPayResponse extends StObject {
  
  /**
    * The current user's ability to pay with one or more of the payment
    * methods specified in
    * [[IsReadyToPayRequest.allowedPaymentMethods|`IsReadyToPayRequest.allowedPaymentMethods`]]
    *
    * This property only exists if
    * [[IsReadyToPayRequest.existingPaymentMethodRequired|`IsReadyToPayRequest.existingPaymentMethodRequired`]]
    * was set to `true`. The property value will always be `true` if the
    * [[PaymentsClient|`PaymentsClient`]] is configured for a test
    * environment.
    */
  var paymentMethodPresent: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * Whether the user is able to provide payment information through the
    * Google Pay payment sheet.
    *
    * A user's ability to pay may be tied to the capabilities of the
    * current context (browser/device) to display required components for
    * the specified payment methods including logging in to a Google
    * Account and providing one of the payment methods specified in
    * [[IsReadyToPayRequest.allowedPaymentMethods|`IsReadyToPayRequest.allowedPaymentMethods`]].
    */
  var result: Boolean
}
object IsReadyToPayResponse {
  
  inline def apply(result: Boolean): IsReadyToPayResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayResponse]
  }
  
  extension [Self <: IsReadyToPayResponse](x: Self) {
    
    inline def setPaymentMethodPresent(value: `false` | `true`): Self = StObject.set(x, "paymentMethodPresent", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodPresentUndefined: Self = StObject.set(x, "paymentMethodPresent", js.undefined)
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
