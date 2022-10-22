package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.anon.Focused
import typingsJapgolly.reactNativeTabView.libTypescriptTabBarItemMod.Props
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBarItem {
  
  inline def apply[T /* <: Route */](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: Callback,
    onPress: Callback,
    position: AnimatedInterpolation[Double | String],
    route: T
  ): Builder[T] = {
    val __props = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = onLongPress.toJsFn, onPress = onPress.toJsFn, position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-native-tab-view", "TabBarItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Route */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def defaultTabWidth(value: Double): this.type = set("defaultTabWidth", value.asInstanceOf[js.Any])
    
    inline def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def pressColor(value: String): this.type = set("pressColor", value.asInstanceOf[js.Any])
    
    inline def pressOpacity(value: Double): this.type = set("pressOpacity", value.asInstanceOf[js.Any])
    
    inline def renderBadge(value: /* scene */ Scene[T] => Node): this.type = set("renderBadge", js.Any.fromFunction1(value))
    
    inline def renderIcon(value: /* scene */ Focused[T] => Node): this.type = set("renderIcon", js.Any.fromFunction1(value))
    
    inline def renderLabel(value: /* scene */ Focused[T] => Node): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps[T /* <: Route */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
