package typingsJapgolly.reactNativeNavbar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarButton
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarProps
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarTitle
import typingsJapgolly.reactNativeNavbar.mod.StatusBar
import typingsJapgolly.reactNativeNavbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeNavbar {
  def apply(
    leftButton: NavigationBarButton | Element = null,
    rightButton: NavigationBarButton | Element = null,
    statusBar: StatusBar = null,
    style: ViewStyle = null,
    tintColor: String = null,
    title: NavigationBarTitle | Element = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavigationBarProps, default, Unit, NavigationBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (leftButton != null) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (rightButton != null) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    if (statusBar != null) __obj.updateDynamic("statusBar")(statusBar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeNavbar.mod.NavigationBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeNavbar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeNavbar.mod.NavigationBarProps])(children: _*)
  }
  @JSImport("react-native-navbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

