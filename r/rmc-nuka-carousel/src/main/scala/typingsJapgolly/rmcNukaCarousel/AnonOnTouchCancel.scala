package typingsJapgolly.rmcNukaCarousel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnTouchCancel extends js.Object {
  def onTouchCancel(e: js.Any): Unit
  def onTouchEnd(e: js.Any): Unit
  def onTouchMove(e: js.Any): Unit
  def onTouchStart(e: js.Any): Unit
}

object AnonOnTouchCancel {
  @scala.inline
  def apply(
    onTouchCancel: js.Any => Callback,
    onTouchEnd: js.Any => Callback,
    onTouchMove: js.Any => Callback,
    onTouchStart: js.Any => Callback
  ): AnonOnTouchCancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: js.Any) => onTouchCancel(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: js.Any) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: js.Any) => onTouchMove(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: js.Any) => onTouchStart(t0).runNow()))
    __obj.asInstanceOf[AnonOnTouchCancel]
  }
}

