package typingsJapgolly.reactDragtastic

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseEnter extends js.Object {
  def onMouseEnter(): Unit
  def onMouseLeave(): Unit
  def onMouseUp(): Unit
}

object AnonOnMouseEnter {
  @scala.inline
  def apply(onMouseEnter: Callback, onMouseLeave: Callback, onMouseUp: Callback): AnonOnMouseEnter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    __obj.updateDynamic("onMouseUp")(onMouseUp.toJsFn)
    __obj.asInstanceOf[AnonOnMouseEnter]
  }
}

