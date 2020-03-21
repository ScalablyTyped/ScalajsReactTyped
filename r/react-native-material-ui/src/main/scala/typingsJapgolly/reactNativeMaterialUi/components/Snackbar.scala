package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonMessage
import typingsJapgolly.reactNativeMaterialUi.mod.ButtonProps
import typingsJapgolly.reactNativeMaterialUi.mod.SnackbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Snackbar {
  def apply(
    bottomNavigation: Boolean,
    message: String,
    timeout: Double,
    visible: Boolean,
    onRequestClose: Callback,
    actionText: String = null,
    button: ButtonProps = null,
    onActionPress: js.UndefOr[Callback] = js.undefined,
    style: AnonMessage = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SnackbarProps, typingsJapgolly.reactNativeMaterialUi.mod.Snackbar, Unit, SnackbarProps] = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onRequestClose")(onRequestClose.toJsFn)
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    onActionPress.foreach(p => __obj.updateDynamic("onActionPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.SnackbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Snackbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.SnackbarProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Snackbar")
  @js.native
  object componentImport extends js.Object
  
}

