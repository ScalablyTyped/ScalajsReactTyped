package typingsJapgolly.atReachRouter.atReachRouterMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Event
import typingsJapgolly.atReachRouter.Anon_PushState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: Anon_PushState
  val location: WindowLocation
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback,
    history: Anon_PushState,
    location: WindowLocation,
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback
  ): HistorySource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[HistorySource]
  }
}

