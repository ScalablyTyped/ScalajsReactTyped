package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var active: Boolean
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  def onTimeout(): js.Any
}

object SnackbarProps {
  @scala.inline
  def apply(
    active: Boolean,
    onTimeout: CallbackTo[js.Any],
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    onActionClick: ReactMouseEventFrom[Snackbar with Element] => Callback = null,
    timeout: Int | Double = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("onTimeout")(onTimeout.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.Snackbar with org.scalajs.dom.raw.Element]) => onActionClick(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

