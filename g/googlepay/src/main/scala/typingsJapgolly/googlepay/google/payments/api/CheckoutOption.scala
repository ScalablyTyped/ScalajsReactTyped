package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for checkout.
  *
  * Options:
  *
  * - `DEFAULT`:
  *   The default option for checkout. Use the 'Continue' button for a buy
  *   flow in the payments sheet. Once loadPaymentData completes, the
  *   integrator should show an order confirmation screen to finalize the
  *   purchase.
  *
  * - `COMPLETE_IMMEDIATE_PURCHASE`:
  *   Use the 'Pay' button to indicate a buy flow without a confirmation in
  *   the payments sheet to indicate that no further confirmation will be
  *   shown and the transaction will be processed once the user confirms
  *   only if
  *   [[TransactionInfo.totalPriceStatus|`TransactionInfo.totalPriceStatus`]]
  *   is set to [[TotalPriceStatus|`FINAL`]]. Otherwise,
  *   a payment data request will fail.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.DEFAULT
  - typingsJapgolly.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE
*/
trait CheckoutOption extends StObject
object CheckoutOption {
  
  inline def COMPLETE_IMMEDIATE_PURCHASE: typingsJapgolly.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE = "COMPLETE_IMMEDIATE_PURCHASE".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE]
  
  inline def DEFAULT: typingsJapgolly.googlepay.googlepayStrings.DEFAULT = "DEFAULT".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.DEFAULT]
}
