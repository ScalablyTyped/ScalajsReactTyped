package typingsJapgolly.shopifyBuy.ShopifyBuy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var checkout: CheckoutResource
  var collection: CollectionResource
  var image: Image
  var product: ProductResource
  var shop: ShopResource
  def fetchNextPage[T /* <: GraphModel */](nextArray: js.Array[T]): js.Array[T]
}

object Client {
  @scala.inline
  def apply(
    checkout: CheckoutResource,
    collection: CollectionResource,
    fetchNextPage: js.Array[js.Any] => CallbackTo[js.Array[js.Any]],
    image: Image,
    product: ProductResource,
    shop: ShopResource
  ): Client = {
    val __obj = js.Dynamic.literal(checkout = checkout.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.updateDynamic("fetchNextPage")(js.Any.fromFunction1((t0: js.Array[js.Any]) => fetchNextPage(t0).runNow()))
    __obj.asInstanceOf[Client]
  }
}

