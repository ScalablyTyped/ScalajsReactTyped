package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountGateway extends js.Object {
  def all(): js.Promise[js.Array[Discount]]
}

object DiscountGateway {
  @scala.inline
  def apply(all: CallbackTo[js.Promise[js.Array[Discount]]]): DiscountGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.asInstanceOf[DiscountGateway]
  }
}

