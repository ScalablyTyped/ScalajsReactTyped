package typingsJapgolly.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/order_status", JSImport.Namespace)
@js.native
object orderStatusMod extends js.Object {
  trait _OrderStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.open
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.closed
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.cancelled
    - typingsJapgolly.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type OrderStatus = _OrderStatus | String
}

