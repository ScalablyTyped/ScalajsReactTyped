package typingsJapgolly.reactDashNavigationDashDrawer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.reactMod.ComponentProps
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`locked-closed`
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`locked-open`
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`on-drag`
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.back
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.fade
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.front
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.none
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.slide
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent ? :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps>,   unmountInactiveRoutes ? :boolean,   contentOptions ? :object} */
trait DrawerOptionscontentComponentComponentTypeDrawerCo extends js.Object {
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  var drawerPosition: left | right
  var drawerType: front | back | slide
  var drawerWidth: Double | js.Function0[Double]
  var edgeWidth: Double
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  var statusBarAnimation: slide | none | fade
  var style: js.UndefOr[ViewStyle] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object DrawerOptionscontentComponentComponentTypeDrawerCo {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade,
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    drawerBackgroundColor: String = null,
    drawerLockMode: unlocked | `locked-closed` | `locked-open` = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: `on-drag` | none = null,
    minSwipeDistance: Int | Double = null,
    onDrawerClose: js.UndefOr[Callback] = js.undefined,
    onDrawerOpen: js.UndefOr[Callback] = js.undefined,
    overlayColor: String = null,
    sceneContainerStyle: ViewStyle = null,
    style: ViewStyle = null,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): DrawerOptionscontentComponentComponentTypeDrawerCo = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    onDrawerClose.foreach(p => __obj.updateDynamic("onDrawerClose")(p.toJsFn))
    onDrawerOpen.foreach(p => __obj.updateDynamic("onDrawerOpen")(p.toJsFn))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptionscontentComponentComponentTypeDrawerCo]
  }
}

