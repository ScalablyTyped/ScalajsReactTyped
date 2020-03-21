package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  def onMouseDown(event: ReactMouseEventFrom[HTMLElement]): Unit
}

object AnonOnMouseDown {
  @scala.inline
  def apply(onMouseDown: ReactMouseEventFrom[HTMLElement] => Callback): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseDown(t0).runNow()))
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

