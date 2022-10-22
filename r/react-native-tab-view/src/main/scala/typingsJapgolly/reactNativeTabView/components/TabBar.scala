package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.anon.Color
import typingsJapgolly.reactNativeTabView.anon.Key
import typingsJapgolly.reactNativeTabView.libTypescriptTabBarMod.Props
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Event
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Layout
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  inline def apply[T /* <: Route */](
    jumpTo: String => Callback,
    layout: Layout,
    navigationState: NavigationState[T],
    position: AnimatedInterpolation[Double | String]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(jumpTo = js.Any.fromFunction1((t0: String) => jumpTo(t0).runNow()), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-native-tab-view", "TabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Route */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    inline def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def getAccessibilityLabel(value: /* scene */ Scene[T] => js.UndefOr[String]): this.type = set("getAccessibilityLabel", js.Any.fromFunction1(value))
    
    inline def getAccessible(value: /* scene */ Scene[T] => js.UndefOr[Boolean]): this.type = set("getAccessible", js.Any.fromFunction1(value))
    
    inline def getLabelText(value: /* scene */ Scene[T] => js.UndefOr[String]): this.type = set("getLabelText", js.Any.fromFunction1(value))
    
    inline def getTestID(value: /* scene */ Scene[T] => js.UndefOr[String]): this.type = set("getTestID", js.Any.fromFunction1(value))
    
    inline def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    
    inline def indicatorContainerStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorContainerStyle", value.asInstanceOf[js.Any])
    
    inline def indicatorContainerStyleNull: this.type = set("indicatorContainerStyle", null)
    
    inline def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def onTabLongPress(value: /* scene */ Scene[T] => Callback): this.type = set("onTabLongPress", js.Any.fromFunction1((t0: /* scene */ Scene[T]) => value(t0).runNow()))
    
    inline def onTabPress(value: /* scene */ Scene[T] & Event => Callback): this.type = set("onTabPress", js.Any.fromFunction1((t0: /* scene */ Scene[T] & Event) => value(t0).runNow()))
    
    inline def pressColor(value: String): this.type = set("pressColor", value.asInstanceOf[js.Any])
    
    inline def pressOpacity(value: Double): this.type = set("pressOpacity", value.asInstanceOf[js.Any])
    
    inline def renderBadge(value: /* scene */ Scene[T] => Node): this.type = set("renderBadge", js.Any.fromFunction1(value))
    
    inline def renderIcon(value: /* scene */ Scene[T] & Color => Node): this.type = set("renderIcon", js.Any.fromFunction1(value))
    
    inline def renderIndicator(
      value: /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarIndicatorMod.Props[T] => Node
    ): this.type = set("renderIndicator", js.Any.fromFunction1(value))
    
    inline def renderLabel(value: /* scene */ Scene[T] & Color => Node): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    inline def renderTabBarItem(
      value: /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarItemMod.Props[T] & Key => Element
    ): this.type = set("renderTabBarItem", js.Any.fromFunction1(value))
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabStyleNull: this.type = set("tabStyle", null)
  }
  
  def withProps[T /* <: Route */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
