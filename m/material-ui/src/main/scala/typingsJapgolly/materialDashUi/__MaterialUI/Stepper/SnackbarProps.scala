package typingsJapgolly.materialDashUi.__MaterialUI.Stepper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialDashUi.__MaterialUI.Snackbar
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import typingsJapgolly.react.reactMod.MouseEventHandler
import typingsJapgolly.react.reactMod.Props
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends Props[Snackbar] {
  var action: js.UndefOr[String] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var message: String | Element
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
   // DEPRECATED
  var open: Boolean
  /** @deprecated Use the open property to control the component instead */
  var openOnMount: js.UndefOr[Boolean] = js.undefined
   // DEPRECATED
  def onRequestClose(reason: String): Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: String | Element,
    onRequestClose: String => Callback,
    open: Boolean,
    action: String = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    children: VdomNode = null,
    className: String = null,
    key: Key = null,
    onActionClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    openOnMount: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[Snackbar] = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: java.lang.String) => onRequestClose(t0).runNow()))
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onActionClick(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (!js.isUndefined(openOnMount)) __obj.updateDynamic("openOnMount")(openOnMount.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

