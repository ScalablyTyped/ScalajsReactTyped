package typingsJapgolly.shopifyBuy.ShopifyBuy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShopResource extends js.Object {
  def fetchInfo(): js.Promise[Shop]
  def fetchPolicies(): js.Promise[Shop]
}

object ShopResource {
  @scala.inline
  def apply(fetchInfo: CallbackTo[js.Promise[Shop]], fetchPolicies: CallbackTo[js.Promise[Shop]]): ShopResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetchInfo")(fetchInfo.toJsFn)
    __obj.updateDynamic("fetchPolicies")(fetchPolicies.toJsFn)
    __obj.asInstanceOf[ShopResource]
  }
}

