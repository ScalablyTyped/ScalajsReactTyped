package typingsJapgolly.atlaskitSingleSelect

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: ReactEventFrom[Element]
  var isOpen: Boolean
}

object AnonEvent {
  @scala.inline
  def apply(event: ReactEventFrom[Element], isOpen: Boolean): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

