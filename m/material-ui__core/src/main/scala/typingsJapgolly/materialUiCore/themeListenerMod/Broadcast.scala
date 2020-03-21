package typingsJapgolly.materialUiCore.themeListenerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadcast[S] extends js.Object {
  def getState(): S = js.native
  def setState(state: S): Unit = js.native
  def subscribe(callback: js.Function1[/* state */ S, Unit]): Double = js.native
  def unsubscribe(subscriptionId: Double): Unit = js.native
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

