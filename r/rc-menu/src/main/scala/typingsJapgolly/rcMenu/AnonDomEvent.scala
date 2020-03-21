package typingsJapgolly.rcMenu

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEvent extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]
  var key: Key
}

object AnonDomEvent {
  @scala.inline
  def apply(domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], key: Key): AnonDomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEvent]
  }
}

