package typingsJapgolly.angularQExtras.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseValue[T] extends js.Object {
  var reason: js.UndefOr[js.Any] = js.undefined
  var state: PromiseState
  var value: js.UndefOr[T] = js.undefined
}

object PromiseValue {
  @scala.inline
  def apply[T](state: PromiseState, reason: js.Any = null, value: T = null): PromiseValue[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseValue[T]]
  }
}

