package typingsJapgolly.rmcCalendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFinish extends js.Object {
  def onFinish(): Unit
  def onTouchCancel(): Unit
  def onTouchEnd(): Unit
  def onTouchMove(evt: ReactTouchEventFrom[HTMLDivElement]): Unit
  def onTouchStart(evt: ReactTouchEventFrom[HTMLDivElement]): Unit
}

object AnonOnFinish {
  @scala.inline
  def apply(
    onFinish: Callback,
    onTouchCancel: Callback,
    onTouchEnd: Callback,
    onTouchMove: ReactTouchEventFrom[HTMLDivElement] => Callback,
    onTouchStart: ReactTouchEventFrom[HTMLDivElement] => Callback
  ): AnonOnFinish = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFinish")(onFinish.toJsFn)
    __obj.updateDynamic("onTouchCancel")(onTouchCancel.toJsFn)
    __obj.updateDynamic("onTouchEnd")(onTouchEnd.toJsFn)
    __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchMove(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchStart(t0).runNow()))
    __obj.asInstanceOf[AnonOnFinish]
  }
}

