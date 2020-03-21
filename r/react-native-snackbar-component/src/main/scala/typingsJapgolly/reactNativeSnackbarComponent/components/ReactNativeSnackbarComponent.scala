package typingsJapgolly.reactNativeSnackbarComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSnackbarComponent.mod.SnackbarComponentProps
import typingsJapgolly.reactNativeSnackbarComponent.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSnackbarComponent {
  def apply(
    accentColor: String = null,
    actionHandler: js.UndefOr[Callback] = js.undefined,
    actionText: String = null,
    autoHidingTime: Int | Double = null,
    backgroundColor: String = null,
    bottom: Int | Double = null,
    distanceCallback: js.UndefOr[Callback] = js.undefined,
    left: Int | Double = null,
    messageColor: String = null,
    position: String = null,
    right: Int | Double = null,
    textMessage: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SnackbarComponentProps, default, Unit, SnackbarComponentProps] = {
    val __obj = js.Dynamic.literal()
  
      if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    actionHandler.foreach(p => __obj.updateDynamic("actionHandler")(p.toJsFn))
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (autoHidingTime != null) __obj.updateDynamic("autoHidingTime")(autoHidingTime.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    distanceCallback.foreach(p => __obj.updateDynamic("distanceCallback")(p.toJsFn))
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (messageColor != null) __obj.updateDynamic("messageColor")(messageColor.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (textMessage != null) __obj.updateDynamic("textMessage")(textMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSnackbarComponent.mod.SnackbarComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSnackbarComponent.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSnackbarComponent.mod.SnackbarComponentProps])(children: _*)
  }
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

