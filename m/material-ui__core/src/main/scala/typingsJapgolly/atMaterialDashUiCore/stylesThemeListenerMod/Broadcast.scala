package typingsJapgolly.atMaterialDashUiCore.stylesThemeListenerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcast[S] extends js.Object {
  def getState(): S
  def setState(state: S): Unit
  def subscribe(callback: js.Function1[/* state */ S, Unit]): Double
  def unsubscribe(subscriptionId: Double): Unit
}

object Broadcast {
  @scala.inline
  def apply[S](
    getState: CallbackTo[S],
    setState: S => Callback,
    subscribe: js.Function1[/* state */ S, Unit] => CallbackTo[Double],
    unsubscribe: Double => Callback
  ): Broadcast[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: S) => setState(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[/* state */ S, scala.Unit]) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: scala.Double) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[Broadcast[S]]
  }
}

