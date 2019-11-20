package typingsJapgolly.materialDashUi.__MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var action: js.UndefOr[Node] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var message: Node
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  var open: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    open: Boolean,
    action: VdomNode = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    message: VdomNode = null,
    onActionClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onRequestClose: /* reason */ String => Callback = null,
    style: CSSProperties = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onActionClick(t0).runNow()))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => onRequestClose(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

