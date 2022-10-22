package typingsJapgolly.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.pricing_type
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Node callback
  */
type Callback[T] = js.Function2[/* error */ Any, /* response */ T, Unit]

/**
  * Create a charge.
  *
  * @link https://commerce.coinbase.com/docs/api/#charge-resource
  */
type CreateCharge = (FixedPrice & BaseCharge) | (NoPrice & BaseCharge)

/**
  * Create a checkout.
  *
  * @link https://commerce.coinbase.com/docs/api/#create-a-checkout
  */
type CreateCheckout = (FixedPrice & BaseCheckout) | (NoPrice & BaseCheckout)

/**
  * Fiat currency.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR
  - java.lang.String
*/
type FiatCurrency = _FiatCurrency | String

/**
  * Key-value object.
  */
type KeyVal = StringDictionary[Any]

/**
  * Omit a property from the given type.
  */
type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

/**
  * Pagination callback.
  */
type PaginationCallback[T] = js.Function3[/* error */ Any, /* response */ js.Array[T], /* pagination */ Pagination, Unit]

/**
  * Timestamp string.
  * ISO 8601
  */
type Timestamp = String

/**
  * Update a checkout resource.
  *
  * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
  */
type UpdateCheckout = Omit[CreateCheckout, pricing_type]
