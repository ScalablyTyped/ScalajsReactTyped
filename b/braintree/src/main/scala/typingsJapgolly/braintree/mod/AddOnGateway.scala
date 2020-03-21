package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gateways
  */
trait AddOnGateway extends js.Object {
  def all(): js.Promise[js.Array[AddOn]]
}

object AddOnGateway {
  @scala.inline
  def apply(all: CallbackTo[js.Promise[js.Array[AddOn]]]): AddOnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.asInstanceOf[AddOnGateway]
  }
}

