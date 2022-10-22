package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StatusBarAnimation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerKeyboardDismissMode
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerLayoutProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerLockMode
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerPosition
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerState
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsDrawerLayoutMod.DrawerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerLayout {
  
  inline def apply(renderNavigationView: Value => Node): Builder = {
    val __props = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerLayoutProps]))
  }
  
  @JSImport("react-native-gesture-handler", "DrawerLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeGestureHandler.mod.DrawerLayout] {
    
    inline def children(
      value: Node | (js.Function1[/* openValue */ js.UndefOr[AnimatedInterpolation[Double | String]], Node])
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* openValue */ js.UndefOr[AnimatedInterpolation[Double | String]] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    inline def drawerBackgroundColor(value: String): this.type = set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def drawerContainerStyle(value: StyleProp[ViewStyle]): this.type = set("drawerContainerStyle", value.asInstanceOf[js.Any])
    
    inline def drawerContainerStyleNull: this.type = set("drawerContainerStyle", null)
    
    inline def drawerLockMode(value: DrawerLockMode): this.type = set("drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def drawerPosition(value: DrawerPosition): this.type = set("drawerPosition", value.asInstanceOf[js.Any])
    
    inline def drawerType(value: DrawerType): this.type = set("drawerType", value.asInstanceOf[js.Any])
    
    inline def drawerWidth(value: Double): this.type = set("drawerWidth", value.asInstanceOf[js.Any])
    
    inline def edgeWidth(value: Double): this.type = set("edgeWidth", value.asInstanceOf[js.Any])
    
    inline def enableTrackpadTwoFingerGesture(value: Boolean): this.type = set("enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
    
    inline def hideStatusBar(value: Boolean): this.type = set("hideStatusBar", value.asInstanceOf[js.Any])
    
    inline def keyboardDismissMode(value: DrawerKeyboardDismissMode): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def minSwipeDistance(value: Double): this.type = set("minSwipeDistance", value.asInstanceOf[js.Any])
    
    inline def onDrawerClose(value: Callback): this.type = set("onDrawerClose", value.toJsFn)
    
    inline def onDrawerOpen(value: Callback): this.type = set("onDrawerOpen", value.toJsFn)
    
    inline def onDrawerSlide(value: /* position */ Double => Callback): this.type = set("onDrawerSlide", js.Any.fromFunction1((t0: /* position */ Double) => value(t0).runNow()))
    
    inline def onDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Callback): this.type = set("onDrawerStateChanged", js.Any.fromFunction2((t0: /* newState */ DrawerState, t1: /* drawerWillShow */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onGestureRef(
      value: /* ref */ typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler => Callback
    ): this.type = set("onGestureRef", js.Any.fromFunction1((t0: /* ref */ typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler) => value(t0).runNow()))
    
    inline def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    
    inline def statusBarAnimation(value: StatusBarAnimation): this.type = set("statusBarAnimation", value.asInstanceOf[js.Any])
    
    inline def useNativeAnimations(value: Boolean): this.type = set("useNativeAnimations", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
