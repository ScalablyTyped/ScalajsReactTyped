package typingsJapgolly.nise.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nise.AnonAbort
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeUploadProgress extends js.Object {
  var eventListeners: AnonAbort
  def addEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit
  def dispatchEvent(event: Event_): Unit
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event_, js.Any]) => Callback,
    dispatchEvent: Event_ => Callback,
    eventListeners: AnonAbort,
    removeEventListener: (String, js.Function1[/* e */ Event_, js.Any]) => Callback
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal(eventListeners = eventListeners.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ typingsJapgolly.std.Event_, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ typingsJapgolly.std.Event_, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[FakeUploadProgress]
  }
}

