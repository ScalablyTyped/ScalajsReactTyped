package typingsJapgolly.reactDashNativeDashGestureDashHandler.drawerLayoutMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.StatusBarAnimation
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLayoutProperties extends js.Object {
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  var drawerType: js.UndefOr[DrawerType] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  def renderNavigationView(progressAnimatedValue: Value): Node
}

object DrawerLayoutProperties {
  @scala.inline
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
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  ): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderNavigationView")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value) => renderNavigationView(t0).runNow()))
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
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2((t0: /* newState */ typingsJapgolly.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerState, t1: /* drawerWillShow */ scala.Boolean) => onDrawerStateChanged(t0, t1).runNow()))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
}

