package typingsJapgolly.reactDragtastic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
}

object AnonOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: ReactMouseEventFrom[Element] => Callback,
    onTouchStart: ReactTouchEventFrom[Element] => Callback
  ): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

