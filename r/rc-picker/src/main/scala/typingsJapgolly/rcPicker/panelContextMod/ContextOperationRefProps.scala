package typingsJapgolly.rcPicker.panelContextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOperationRefProps extends js.Object {
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ ReactKeyboardEventFrom[HTMLElement], Boolean]] = js.undefined
}

object ContextOperationRefProps {
  @scala.inline
  def apply(
    onClose: js.UndefOr[Callback] = js.undefined,
    onKeyDown: /* e */ ReactKeyboardEventFrom[HTMLElement] => CallbackTo[Boolean] = null
  ): ContextOperationRefProps = {
    val __obj = js.Dynamic.literal()
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[ContextOperationRefProps]
  }
}

