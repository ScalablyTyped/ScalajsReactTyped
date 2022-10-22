package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the total price used.
  *
  * Options:
  *
  * - `NOT_CURRENTLY_KNOWN`:
  *   The total price is not known currently.
  *
  * - `ESTIMATED`:
  *   The total price provided is an estimated price. The final price may
  *   change depending on the selected shipping address or billing address,
  *   if requested.
  *
  * - `FINAL`:
  *   The total price is the final total price of the transaction, and will
  *   not change based on selections made by the buyer.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
  - typingsJapgolly.googlepay.googlepayStrings.ESTIMATED
  - typingsJapgolly.googlepay.googlepayStrings.FINAL
*/
trait TotalPriceStatus extends StObject
object TotalPriceStatus {
  
  inline def ESTIMATED: typingsJapgolly.googlepay.googlepayStrings.ESTIMATED = "ESTIMATED".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.ESTIMATED]
  
  inline def FINAL: typingsJapgolly.googlepay.googlepayStrings.FINAL = "FINAL".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.FINAL]
  
  inline def NOT_CURRENTLY_KNOWN: typingsJapgolly.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN]
}
