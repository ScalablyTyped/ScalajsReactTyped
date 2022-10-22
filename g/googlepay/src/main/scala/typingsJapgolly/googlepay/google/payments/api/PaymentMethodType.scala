package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment method type enum string.
  *
  * Options:
  *
  * - `CARD`:
  *   CARD payment method.
  *
  *   Note that the payment method information that may be returned to you
  *   or your processor for a credit card transaction is meant to be used
  *   only once. If you need to charge the user again you must call the
  *   APIs to obtain new payment credentials.
  *
  *   Also note that when we transfer information like PAN (personal
  *   account number) to either you or your gateway/processor, they may not
  *   correspond to the user's physical card. For support purposes, please
  *   use user's card info returned in [[CardInfo|`CardInfo`]] instead.
  *
  * - `PAYPAL`:
  *   PAYPAL payment method.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.CARD
  - typingsJapgolly.googlepay.googlepayStrings.PAYPAL
*/
trait PaymentMethodType extends StObject
object PaymentMethodType {
  
  inline def CARD: typingsJapgolly.googlepay.googlepayStrings.CARD = "CARD".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.CARD]
  
  inline def PAYPAL: typingsJapgolly.googlepay.googlepayStrings.PAYPAL = "PAYPAL".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.PAYPAL]
}
