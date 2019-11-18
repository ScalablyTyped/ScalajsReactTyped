package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEvent extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]
  var key: Key
}

object Anon_DomEvent {
  @scala.inline
  def apply(domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], key: Key): Anon_DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEvent]
  }
}

