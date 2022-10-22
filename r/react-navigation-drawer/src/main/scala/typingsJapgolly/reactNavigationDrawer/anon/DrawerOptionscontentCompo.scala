package typingsJapgolly.reactNavigationDrawer.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerProps_
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps> | undefined,   unmountInactiveRoutes :boolean | undefined,   contentOptions :object | undefined} */
trait DrawerOptionscontentCompo extends StObject {
  
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  
  var drawerPosition: left | right
  
  var drawerType: front | back | slide
  
  var drawerWidth: Double | js.Function0[Double]
  
  var edgeWidth: Double
  
  var gestureHandlerProps: js.UndefOr[ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]] = js.undefined
  
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
object DrawerOptionscontentCompo {
  
  inline def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade
  ): DrawerOptionscontentCompo = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptionscontentCompo]
  }
  
  extension [Self <: DrawerOptionscontentCompo](x: Self) {
    
    inline def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
    
    inline def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
    
    inline def setContentOptions(value: js.Object): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
    
    inline def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
    
    inline def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
    
    inline def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
    
    inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
    
    inline def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
    
    inline def setDrawerWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    inline def setDrawerWidthCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "drawerWidth", value.toJsFn)
    
    inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    inline def setGestureHandlerProps(value: ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
    
    inline def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
    
    inline def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
    
    inline def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
    
    inline def setKeyboardDismissMode(value: `on-drag` | none): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
    
    inline def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
    
    inline def setOnDrawerClose(value: Callback): Self = StObject.set(x, "onDrawerClose", value.toJsFn)
    
    inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
    
    inline def setOnDrawerOpen(value: Callback): Self = StObject.set(x, "onDrawerOpen", value.toJsFn)
    
    inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
    
    inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    inline def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
    
    inline def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnmountInactiveRoutes(value: Boolean): Self = StObject.set(x, "unmountInactiveRoutes", value.asInstanceOf[js.Any])
    
    inline def setUnmountInactiveRoutesUndefined: Self = StObject.set(x, "unmountInactiveRoutes", js.undefined)
  }
}
