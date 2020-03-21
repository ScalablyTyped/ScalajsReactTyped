package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StatusBarAnimation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerLayoutProperties
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerLayout {
  def apply(
    renderNavigationView: Value => CallbackTo[Node],
    contentContainerStyle: StyleProp[ViewStyle] = null,
    drawerBackgroundColor: String = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: DrawerPosition = null,
    drawerType: DrawerType = null,
    drawerWidth: Int | Double = null,
    edgeWidth: Int | Double = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: DrawerKeyboardDismissMode = null,
    minSwipeDistance: Int | Double = null,
    onDrawerClose: js.UndefOr[Callback] = js.undefined,
    onDrawerOpen: js.UndefOr[Callback] = js.undefined,
    onDrawerStateChanged: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Callback = null,
    overlayColor: String = null,
    statusBarAnimation: StatusBarAnimation = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerLayoutProperties, default, Unit, DrawerLayoutProperties] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("renderNavigationView")(js.Any.fromFunction1((t0: typingsJapgolly.reactNative.mod.Animated.Value) => renderNavigationView(t0).runNow()))
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    onDrawerClose.foreach(p => __obj.updateDynamic("onDrawerClose")(p.toJsFn))
    onDrawerOpen.foreach(p => __obj.updateDynamic("onDrawerOpen")(p.toJsFn))
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2((t0: /* newState */ typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerState, t1: /* drawerWillShow */ scala.Boolean) => onDrawerStateChanged(t0, t1).runNow()))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerLayoutProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod.DrawerLayoutProperties])(children: _*)
  }
  @JSImport("react-native-gesture-handler/DrawerLayout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

