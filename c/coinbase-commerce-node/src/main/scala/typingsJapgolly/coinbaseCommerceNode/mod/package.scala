package typingsJapgolly.coinbaseCommerceNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Node callback
    */
  type Callback[T] = js.Function2[/* error */ js.Any, /* response */ T, scala.Unit]
  /**
    * Create a charge.
    *
    * @link https://commerce.coinbase.com/docs/api/#charge-resource
    */
  type CreateCharge = typingsJapgolly.coinbaseCommerceNode.mod.BaseCharge with (typingsJapgolly.coinbaseCommerceNode.mod.FixedPrice | typingsJapgolly.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Create a checkout.
    *
    * @link https://commerce.coinbase.com/docs/api/#create-a-checkout
    */
  type CreateCheckout = typingsJapgolly.coinbaseCommerceNode.mod.BaseCheckout with (typingsJapgolly.coinbaseCommerceNode.mod.FixedPrice | typingsJapgolly.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Fiat currency.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD
    - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP
    - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR
    - java.lang.String
  */
  type FiatCurrency = typingsJapgolly.coinbaseCommerceNode.mod._FiatCurrency | java.lang.String
  /**
    * Key-value object.
    */
  type KeyVal = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * Pagination callback.
    */
  type PaginationCallback[T] = js.Function3[
    /* error */ js.Any, 
    /* response */ js.Array[T], 
    /* pagination */ typingsJapgolly.coinbaseCommerceNode.mod.Pagination, 
    scala.Unit
  ]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = java.lang.String
  /**
    * Update a checkout resource.
    *
    * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
    */
  type UpdateCheckout = typingsJapgolly.coinbaseCommerceNode.mod.Omit[
    typingsJapgolly.coinbaseCommerceNode.mod.CreateCheckout, 
    typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.pricing_type
  ]
}
