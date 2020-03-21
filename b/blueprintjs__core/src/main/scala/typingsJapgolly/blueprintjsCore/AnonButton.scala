package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  def button(ref: HTMLElement): Unit
}

object AnonButton {
  @scala.inline
  def apply(button: HTMLElement => Callback): AnonButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => button(t0).runNow()))
    __obj.asInstanceOf[AnonButton]
  }
}

