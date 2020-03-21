package typingsJapgolly.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/order_cancel_reason", JSImport.Namespace)
@js.native
object orderCancelReasonMod extends js.Object {
  trait _OrderCancelReason extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.customer
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.inventory
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.fraud
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.other
    - java.lang.String
  */
  type OrderCancelReason = _OrderCancelReason | String
}

