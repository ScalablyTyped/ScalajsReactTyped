package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  def onClick(): Unit
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
}

object AnonLabel {
  @scala.inline
  def apply(label: String, onClick: Callback, onMouseEnter: Callback, onMouseLeave: Callback): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    __obj.asInstanceOf[AnonLabel]
  }
}

