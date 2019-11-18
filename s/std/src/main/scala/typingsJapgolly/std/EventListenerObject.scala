package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject extends js.Object {
  def handleEvent(evt: org.scalajs.dom.raw.Event): Unit
}

object EventListenerObject {
  @scala.inline
  def apply(handleEvent: org.scalajs.dom.raw.Event => Callback): EventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Event) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject]
  }
}

