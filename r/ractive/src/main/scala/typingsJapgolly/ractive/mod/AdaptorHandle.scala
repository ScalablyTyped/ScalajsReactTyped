package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptorHandle extends js.Object {
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): js.Any
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: js.Any): Unit
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: js.Any): Unit
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit
}

object AdaptorHandle {
  @scala.inline
  def apply(
    get: CallbackTo[js.Any],
    reset: js.Any => Callback,
    set: (String, js.Any) => Callback,
    teardown: Callback
  ): AdaptorHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: js.Any) => reset(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("teardown")(teardown.toJsFn)
    __obj.asInstanceOf[AdaptorHandle]
  }
}

