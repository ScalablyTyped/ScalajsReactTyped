package typingsJapgolly.stellarSdk

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject extends js.Object {
  def handleEvent(evt: Event): Unit
}

object EventListenerObject {
  @scala.inline
  def apply(handleEvent: Event => Callback): EventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.stellarSdk.Event) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject]
  }
}

