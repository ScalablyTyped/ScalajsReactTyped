package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactSelect.typesMod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnKeyDown extends js.Object {
  var onKeyDown: KeyboardEventHandler
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[AnonOnKeyDown]
  }
}

