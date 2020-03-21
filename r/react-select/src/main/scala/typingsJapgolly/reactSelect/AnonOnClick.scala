package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick extends js.Object {
  def onClick(event: js.Any): Unit
  def onMouseDown(event: js.Any): Unit
  def onTouchEnd(event: js.Any): Unit
}

object AnonOnClick {
  @scala.inline
  def apply(onClick: js.Any => Callback, onMouseDown: js.Any => Callback, onTouchEnd: js.Any => Callback): AnonOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: js.Any) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: js.Any) => onTouchEnd(t0).runNow()))
    __obj.asInstanceOf[AnonOnClick]
  }
}

