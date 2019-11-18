package typingsJapgolly.mobx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigurableEnumerableGetSet extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  def get(): js.UndefOr[scala.Nothing]
  def set(v: js.Any): Unit
}

object Anon_ConfigurableEnumerableGetSet {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    get: CallbackTo[js.UndefOr[scala.Nothing]],
    set: js.Any => Callback
  ): Anon_ConfigurableEnumerableGetSet = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Any) => set(t0).runNow()))
    __obj.asInstanceOf[Anon_ConfigurableEnumerableGetSet]
  }
}

