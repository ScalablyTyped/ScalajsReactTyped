package typingsJapgolly.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_status", JSImport.Namespace)
@js.native
object transactionStatusMod extends js.Object {
  trait _TransactionStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.pending
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.failure
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.success
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.error
    - java.lang.String
  */
  type TransactionStatus = _TransactionStatus | String
}

