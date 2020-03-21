package typingsJapgolly.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/financial_status", JSImport.Namespace)
@js.native
object financialStatusMod extends js.Object {
  trait _FinancialStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.authorized
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.pending
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.paid
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.partially_paid
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.refunded
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.voided
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.partially_refunded
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.unpaid
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type FinancialStatus = _FinancialStatus | String
}

