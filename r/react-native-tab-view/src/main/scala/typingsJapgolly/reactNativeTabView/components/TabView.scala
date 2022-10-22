package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.Orientation
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.OverScrollMode
import typingsJapgolly.reactNativeTabView.anon.PartialLayout
import typingsJapgolly.reactNativeTabView.libTypescriptTabViewMod.Props
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.SceneRendererProps
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.locale
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.ltr
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.rtl
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabView {
  
  inline def apply[T /* <: Route */](
    navigationState: NavigationState[T],
    onIndexChange: Double => Callback,
    renderScene: SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.Route[T] => Node
  ): Builder[T] = {
    val __props = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1((t0: Double) => onIndexChange(t0).runNow()), renderScene = js.Any.fromFunction1(renderScene))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-native-tab-view", "TabView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Route */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animationEnabled(value: Boolean): this.type = set("animationEnabled", value.asInstanceOf[js.Any])
    
    inline def initialLayout(value: PartialLayout): this.type = set("initialLayout", value.asInstanceOf[js.Any])
    
    inline def keyboardDismissMode(value: none | `on-drag` | auto): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def layoutDirection(value: rtl | ltr | locale): this.type = set("layoutDirection", value.asInstanceOf[js.Any])
    
    inline def `lazy`(
      value: (js.Function1[/* props */ typingsJapgolly.reactNativeTabView.anon.Route[T], Boolean]) | Boolean
    ): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def lazyFunction1(value: /* props */ typingsJapgolly.reactNativeTabView.anon.Route[T] => Boolean): this.type = set("lazy", js.Any.fromFunction1(value))
    
    inline def lazyPreloadDistance(value: Double): this.type = set("lazyPreloadDistance", value.asInstanceOf[js.Any])
    
    inline def offscreenPageLimit(value: Double): this.type = set("offscreenPageLimit", value.asInstanceOf[js.Any])
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onSwipeEnd(value: Callback): this.type = set("onSwipeEnd", value.toJsFn)
    
    inline def onSwipeStart(value: Callback): this.type = set("onSwipeStart", value.toJsFn)
    
    inline def orientation(value: Orientation): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def overScrollMode(value: OverScrollMode): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    inline def overdrag(value: Boolean): this.type = set("overdrag", value.asInstanceOf[js.Any])
    
    inline def pageMargin(value: Double): this.type = set("pageMargin", value.asInstanceOf[js.Any])
    
    inline def pagerStyle(value: StyleProp[ViewStyle]): this.type = set("pagerStyle", value.asInstanceOf[js.Any])
    
    inline def pagerStyleNull: this.type = set("pagerStyle", null)
    
    inline def renderLazyPlaceholder(value: /* props */ typingsJapgolly.reactNativeTabView.anon.Route[T] => Node): this.type = set("renderLazyPlaceholder", js.Any.fromFunction1(value))
    
    inline def renderTabBar(
      value: /* props */ SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.NavigationState[T] => Node
    ): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    inline def sceneContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sceneContainerStyle", value.asInstanceOf[js.Any])
    
    inline def sceneContainerStyleNull: this.type = set("sceneContainerStyle", null)
    
    inline def showPageIndicator(value: Boolean): this.type = set("showPageIndicator", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeEnabled(value: Boolean): this.type = set("swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: Route */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
