package typingsJapgolly.alt.AltJS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltStore[S] extends js.Object {
  def emitChange(): Unit
  def getState(): S
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[Unit]
  def unlisten(handler: js.Function1[/* state */ S, _]): Unit
}

object AltStore {
  @scala.inline
  def apply[S](
    emitChange: Callback,
    getState: CallbackTo[S],
    listen: js.Function1[/* state */ S, js.Any] => CallbackTo[js.Function0[Unit]],
    unlisten: js.Function1[/* state */ S, js.Any] => Callback
  ): AltStore[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emitChange")(emitChange.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: js.Function1[/* state */ S, js.Any]) => listen(t0).runNow()))
    __obj.updateDynamic("unlisten")(js.Any.fromFunction1((t0: js.Function1[/* state */ S, js.Any]) => unlisten(t0).runNow()))
    __obj.asInstanceOf[AltStore[S]]
  }
}

