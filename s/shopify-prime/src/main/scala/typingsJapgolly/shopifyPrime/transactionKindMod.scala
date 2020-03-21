package typingsJapgolly.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_kind", JSImport.Namespace)
@js.native
object transactionKindMod extends js.Object {
  trait _TransactionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.authorization
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.capture
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.sale
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.void
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.refund
    - java.lang.String
  */
  type TransactionKind = _TransactionKind | String
}

