package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StatusBarProps
import typingsJapgolly.reactNative.mod.StatusBarStyle
import typingsJapgolly.reactNative.reactNativeStrings.fade
import typingsJapgolly.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatusBar {
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    barStyle: StatusBarStyle = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined,
    showHideTransition: fade | slide = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StatusBarProps, typingsJapgolly.reactNative.mod.StatusBar, Unit, StatusBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(networkActivityIndicatorVisible)) __obj.updateDynamic("networkActivityIndicatorVisible")(networkActivityIndicatorVisible.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.StatusBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.StatusBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.StatusBarProps])(children: _*)
  }
  @JSImport("react-native", "StatusBar")
  @js.native
  object componentImport extends js.Object
  
}

