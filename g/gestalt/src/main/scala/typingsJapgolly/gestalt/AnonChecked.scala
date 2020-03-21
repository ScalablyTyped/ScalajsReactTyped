package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var event: ReactEventFrom[HTMLInputElement]
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, event: ReactEventFrom[HTMLInputElement]): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

