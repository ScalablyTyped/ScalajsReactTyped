package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadValue extends js.Object {
  def readValue(element: HTMLElement): js.Any
  def writeValue(element: HTMLElement, value: js.Any): Unit
}

object AnonReadValue {
  @scala.inline
  def apply(readValue: HTMLElement => CallbackTo[js.Any], writeValue: (HTMLElement, js.Any) => Callback): AnonReadValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readValue")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => readValue(t0).runNow()))
    __obj.updateDynamic("writeValue")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any) => writeValue(t0, t1).runNow()))
    __obj.asInstanceOf[AnonReadValue]
  }
}

