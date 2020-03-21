package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeMaterialUi.AnonContainer
import typingsJapgolly.reactNativeMaterialUi.AnonIcon
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actions: js.UndefOr[js.Array[AnonIcon | Element | String]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonContainer] = js.undefined
  var transition: js.UndefOr[toolbar | speedDial] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    actions: js.Array[AnonIcon | Element | String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: AnonContainer = null,
    transition: toolbar | speedDial = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
}

