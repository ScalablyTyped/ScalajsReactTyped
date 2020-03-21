package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.AnonAbort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: AnonAbort
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
  def dispatchEvent(event: Event): Unit
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
}

object SinonFakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Callback,
    dispatchEvent: Event => Callback,
    eventListeners: AnonAbort,
    removeEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Callback
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(eventListeners = eventListeners.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ typingsJapgolly.cypress.sinonMod.Event, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.Event) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ typingsJapgolly.cypress.sinonMod.Event, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
}

