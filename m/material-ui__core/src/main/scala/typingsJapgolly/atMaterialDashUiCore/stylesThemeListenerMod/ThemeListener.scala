package typingsJapgolly.atMaterialDashUiCore.stylesThemeListenerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeListener[S] extends js.Object {
  def initial(context: MuiContext[S]): S | Null
  def subscribe(context: MuiContext[S], callback: js.Function1[/* state */ S, Unit]): Double | Null
  def unsubscribe(context: MuiContext[S], subscriptionId: Double): Unit
}

object ThemeListener {
  @scala.inline
  def apply[S](
    initial: MuiContext[S] => CallbackTo[S | Null],
    subscribe: (MuiContext[S], js.Function1[/* state */ S, Unit]) => CallbackTo[Double | Null],
    unsubscribe: (MuiContext[S], Double) => Callback
  ): ThemeListener[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initial")(js.Any.fromFunction1((t0: typingsJapgolly.atMaterialDashUiCore.stylesThemeListenerMod.MuiContext[S]) => initial(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: typingsJapgolly.atMaterialDashUiCore.stylesThemeListenerMod.MuiContext[S], t1: js.Function1[/* state */ S, scala.Unit]) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: typingsJapgolly.atMaterialDashUiCore.stylesThemeListenerMod.MuiContext[S], t1: scala.Double) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[ThemeListener[S]]
  }
}

