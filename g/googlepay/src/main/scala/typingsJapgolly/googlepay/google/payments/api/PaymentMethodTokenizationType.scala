package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment method tokenization type enum string.
  *
  * Options:
  *
  * - `PAYMENT_GATEWAY`:
  *   Tokenize a payment response to be consumed or charged by a specified
  *   third-party gateway service.
  *
  * - `DIRECT`:
  *   Tokenize to be consumed/charged directly by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.PAYMENT_GATEWAY
  - typingsJapgolly.googlepay.googlepayStrings.DIRECT
*/
trait PaymentMethodTokenizationType extends StObject
object PaymentMethodTokenizationType {
  
  inline def DIRECT: typingsJapgolly.googlepay.googlepayStrings.DIRECT = "DIRECT".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.DIRECT]
  
  inline def PAYMENT_GATEWAY: typingsJapgolly.googlepay.googlepayStrings.PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.PAYMENT_GATEWAY]
}
