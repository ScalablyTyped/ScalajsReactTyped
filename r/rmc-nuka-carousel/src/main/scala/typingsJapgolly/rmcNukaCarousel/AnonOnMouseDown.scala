package typingsJapgolly.rmcNukaCarousel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  def onMouseDown(e: js.Any): Unit
  def onMouseLeave(e: js.Any): Unit
  def onMouseMove(e: js.Any): Unit
  def onMouseOut(): Unit
  def onMouseOver(): Unit
  def onMouseUp(e: js.Any): Unit
}

object AnonOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: js.Any => Callback,
    onMouseLeave: js.Any => Callback,
    onMouseMove: js.Any => Callback,
    onMouseOut: Callback,
    onMouseOver: Callback,
    onMouseUp: js.Any => Callback
  ): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: js.Any) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: js.Any) => onMouseLeave(t0).runNow()))
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: js.Any) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("onMouseOut")(onMouseOut.toJsFn)
    __obj.updateDynamic("onMouseOver")(onMouseOver.toJsFn)
    __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: js.Any) => onMouseUp(t0).runNow()))
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

