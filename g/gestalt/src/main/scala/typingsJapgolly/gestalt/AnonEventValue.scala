package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventValue extends js.Object {
  var event: ReactEventFrom[HTMLInputElement]
  var value: Boolean
}

object AnonEventValue {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLInputElement], value: Boolean): AnonEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventValue]
  }
}

