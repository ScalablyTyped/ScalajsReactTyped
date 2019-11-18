package typingsJapgolly.antd.libTableCreateStoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def getState(): js.Any
  def setState(partial: js.Object): Unit
  def subscribe(listener: js.Function0[Unit]): js.Function0[Unit]
}

object Store {
  @scala.inline
  def apply(
    getState: CallbackTo[js.Any],
    setState: js.Object => Callback,
    subscribe: js.Function0[Unit] => CallbackTo[js.Function0[Unit]]
  ): Store = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: js.Object) => setState(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Store]
  }
}

