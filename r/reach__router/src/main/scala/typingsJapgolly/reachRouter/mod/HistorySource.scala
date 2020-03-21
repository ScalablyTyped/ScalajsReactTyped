package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reachRouter.AnonPushState
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: AnonPushState
  val location: WindowLocation
  def addEventListener(name: String, listener: js.Function1[/* event */ Event_, Unit]): Unit
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event_, Unit]): Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event_, Unit]) => Callback,
    history: AnonPushState,
    location: WindowLocation,
    removeEventListener: (String, js.Function1[/* event */ Event_, Unit]) => Callback
  ): HistorySource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* event */ typingsJapgolly.std.Event_, scala.Unit]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* event */ typingsJapgolly.std.Event_, scala.Unit]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[HistorySource]
  }
}

