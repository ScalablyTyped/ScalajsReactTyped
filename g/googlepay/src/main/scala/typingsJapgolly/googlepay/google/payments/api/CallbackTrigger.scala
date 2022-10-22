package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for the callback trigger.
  *
  * Options:
  *
  * - `OFFER`:
  *   Callback occurs after offer info is changed.
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs after shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs after shipping option is changed.
  *
  * - `INITIALIZE`:
  *   Callback occurs on initialize, every field specified by callback
  *   intent would be returned in
  *   [[IntermediatePaymentData|`IntermediatePaymentData`]] if applicable.
  *
  *   Note that this callback trigger may be triggered multiple times along
  *   a single call to loadPaymentData, so you must make sure you can
  *   handle multiple calls to it. For example, when the user changes
  *   accounts, we will call initialize again with data from the new
  *   account.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.OFFER
  - typingsJapgolly.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION
  - typingsJapgolly.googlepay.googlepayStrings.INITIALIZE
*/
trait CallbackTrigger extends StObject
object CallbackTrigger {
  
  inline def INITIALIZE: typingsJapgolly.googlepay.googlepayStrings.INITIALIZE = "INITIALIZE".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.INITIALIZE]
  
  inline def OFFER: typingsJapgolly.googlepay.googlepayStrings.OFFER = "OFFER".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.OFFER]
  
  inline def SHIPPING_ADDRESS: typingsJapgolly.googlepay.googlepayStrings.SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.SHIPPING_ADDRESS]
  
  inline def SHIPPING_OPTION: typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION]
}
