package typingsJapgolly.rcMenu

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement]
  var key: Key
}

object AnonKey {
  @scala.inline
  def apply(domEvent: ReactMouseEventFrom[HTMLElement], key: Key): AnonKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

