package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]
}

object AnonEvent {
  @scala.inline
  def apply(event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

