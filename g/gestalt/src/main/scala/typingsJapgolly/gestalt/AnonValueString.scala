package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var event: ReactEventFrom[ReactFocusEventFrom[Element] with Element]
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(event: ReactEventFrom[ReactFocusEventFrom[Element] with Element], value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

