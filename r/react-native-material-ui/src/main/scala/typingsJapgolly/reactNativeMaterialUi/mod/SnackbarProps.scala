package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialUi.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var actionText: js.UndefOr[String] = js.undefined
  var bottomNavigation: Boolean
  var button: js.UndefOr[ButtonProps] = js.undefined
  var message: String
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonMessage] = js.undefined
  var timeout: Double
  var visible: Boolean
  def onRequestClose(): Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: Callback,
    timeout: Double,
    visible: Boolean,
    actionText: String = null,
    button: ButtonProps = null,
    onActionPress: js.UndefOr[Callback] = js.undefined,
    style: AnonMessage = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onRequestClose")(onRequestClose.toJsFn)
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    onActionPress.foreach(p => __obj.updateDynamic("onActionPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

