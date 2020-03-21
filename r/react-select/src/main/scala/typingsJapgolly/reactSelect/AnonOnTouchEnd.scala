package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnTouchEnd extends js.Object {
  var className: String
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object AnonOnTouchEnd {
  @scala.inline
  def apply(
    className: String,
    onClick: js.Any => Callback,
    onMouseDown: js.Any => Callback,
    onTouchEnd: js.Any => Callback
  ): AnonOnTouchEnd = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: js.Any) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: js.Any) => onTouchEnd(t0).runNow()))
    __obj.asInstanceOf[AnonOnTouchEnd]
  }
}

