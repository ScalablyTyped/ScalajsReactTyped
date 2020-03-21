package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigurable[T /* <: js.Function */] extends js.Object {
  var configurable: Boolean
  def get(): T
}

object AnonConfigurable {
  @scala.inline
  def apply[T /* <: js.Function */](configurable: Boolean, get: CallbackTo[T]): AnonConfigurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[AnonConfigurable[T]]
  }
}

