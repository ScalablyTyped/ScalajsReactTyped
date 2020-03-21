package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventSyntheticEvent extends js.Object {
  var event: ReactEventFrom[ReactMouseEventFrom[HTMLDivElement] with Element]
}

object AnonEventSyntheticEvent {
  @scala.inline
  def apply(event: ReactEventFrom[ReactMouseEventFrom[HTMLDivElement] with Element]): AnonEventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventSyntheticEvent]
  }
}

