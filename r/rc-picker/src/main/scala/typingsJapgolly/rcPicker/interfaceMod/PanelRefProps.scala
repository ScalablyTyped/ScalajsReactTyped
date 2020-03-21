package typingsJapgolly.rcPicker.interfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelRefProps extends js.Object {
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ ReactKeyboardEventFrom[HTMLElement], Boolean]] = js.undefined
}

object PanelRefProps {
  @scala.inline
  def apply(
    onBlur: ReactFocusEventFrom[HTMLElement] => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onKeyDown: /* e */ ReactKeyboardEventFrom[HTMLElement] => CallbackTo[Boolean] = null
  ): PanelRefProps = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[PanelRefProps]
  }
}

