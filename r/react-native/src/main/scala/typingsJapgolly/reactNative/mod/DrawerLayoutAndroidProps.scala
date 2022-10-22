package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNative.reactNativeStrings.Dragging
import typingsJapgolly.reactNative.reactNativeStrings.Idle
import typingsJapgolly.reactNative.reactNativeStrings.Settling
import typingsJapgolly.reactNative.reactNativeStrings.`locked-closed`
import typingsJapgolly.reactNative.reactNativeStrings.`locked-open`
import typingsJapgolly.reactNative.reactNativeStrings.`on-drag`
import typingsJapgolly.reactNative.reactNativeStrings.left
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.right
import typingsJapgolly.reactNative.reactNativeStrings.unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerLayoutAndroidProps
  extends StObject
     with ViewProps {
  
  /**
    * Specifies the background color of the drawer. The default value
    * is white. If you want to set the opacity of the drawer, use rgba.
    * Example:
    * return (
    *   <DrawerLayoutAndroid drawerBackgroundColor="rgba(0,0,0,0.5)">
    *   </DrawerLayoutAndroid>
    *);
    */
  var drawerBackgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked
    * in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond
    *   (open/close) to touch gestures.
    *
    * - locked-closed, meaning that the drawer will stay closed and not
    *   respond to gestures.
    *
    * - locked-open, meaning that the drawer will stay opened and
    *   not respond to gestures. The drawer may still be opened and
    *   closed programmatically (openDrawer/closeDrawer).
    */
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    * - 'left' (the default)
    * - 'right'
    */
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  
  /**
    * Specifies the width of the drawer, more precisely the width of the
    * view that be pulled in from the edge of the window.
    */
  var drawerWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * Function called when the drawer state has changed.
    * The drawer can be in 3 states:
    * - idle, meaning there is no interaction with the navigation
    *   view happening at the time
    * - dragging, meaning there is currently an interaction with the
    *   navigation view
    * - settling, meaning that there was an interaction with the
    *   navigation view, and the navigation view is now finishing
    *   it's closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[js.Function1[/* event */ Idle | Dragging | Settling, Unit]] = js.undefined
  
  /**
    * The navigation view that will be rendered to the side of the
    * screen and can be pulled in.
    */
  def renderNavigationView(): typingsJapgolly.react.mod.global.JSX.Element
  
  /**
    * Make the drawer take the entire screen and draw the background of
    * the status bar to allow it to open over the status bar. It will
    * only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[ColorValue] = js.undefined
}
object DrawerLayoutAndroidProps {
  
  inline def apply(renderNavigationView: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): DrawerLayoutAndroidProps = {
    val __obj = js.Dynamic.literal(renderNavigationView = renderNavigationView.toJsFn)
    __obj.asInstanceOf[DrawerLayoutAndroidProps]
  }
  
  extension [Self <: DrawerLayoutAndroidProps](x: Self) {
    
    inline def setDrawerBackgroundColor(value: ColorValue): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
    
    inline def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
    
    inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
    
    inline def setDrawerPositionUndefined: Self = StObject.set(x, "drawerPosition", js.undefined)
    
    inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setOnDrawerClose(value: Callback): Self = StObject.set(x, "onDrawerClose", value.toJsFn)
    
    inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
    
    inline def setOnDrawerOpen(value: Callback): Self = StObject.set(x, "onDrawerOpen", value.toJsFn)
    
    inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
    
    inline def setOnDrawerSlide(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnDrawerSlideUndefined: Self = StObject.set(x, "onDrawerSlide", js.undefined)
    
    inline def setOnDrawerStateChanged(value: /* event */ Idle | Dragging | Settling => Callback): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction1((t0: /* event */ Idle | Dragging | Settling) => value(t0).runNow()))
    
    inline def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
    
    inline def setRenderNavigationView(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "renderNavigationView", value.toJsFn)
    
    inline def setStatusBarBackgroundColor(value: ColorValue): Self = StObject.set(x, "statusBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setStatusBarBackgroundColorUndefined: Self = StObject.set(x, "statusBarBackgroundColor", js.undefined)
  }
}
