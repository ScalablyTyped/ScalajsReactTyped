package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.Bottom
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.Focused
import typingsJapgolly.reactNativePaper.anon.JumpTo
import typingsJapgolly.reactNativePaper.anon.PickPropsstylenavigationS
import typingsJapgolly.reactNativePaper.anon.Route
import typingsJapgolly.reactNativePaper.anon.routeRouteTabPressEvent
import typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.NavigationState
import typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.TouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigation {
  
  inline def apply(
    navigationState: NavigationState,
    onIndexChange: /* index */ Double => Callback,
    renderScene: /* props */ JumpTo => Node | Null
  ): Builder = {
    val __props = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1((t0: /* index */ Double) => onIndexChange(t0).runNow()), renderScene = js.Any.fromFunction1(renderScene))
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsstylenavigationS]))
  }
  
  @JSImport("react-native-paper", "BottomNavigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def barStyle(value: StyleProp[ViewStyle]): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    inline def barStyleNull: this.type = set("barStyle", null)
    
    inline def getAccessibilityLabel(value: /* props */ Route => js.UndefOr[String]): this.type = set("getAccessibilityLabel", js.Any.fromFunction1(value))
    
    inline def getBadge(value: /* props */ Route => js.UndefOr[Boolean | Double | String]): this.type = set("getBadge", js.Any.fromFunction1(value))
    
    inline def getColor(value: /* props */ Route => js.UndefOr[String]): this.type = set("getColor", js.Any.fromFunction1(value))
    
    inline def getLabelText(value: /* props */ Route => js.UndefOr[String]): this.type = set("getLabelText", js.Any.fromFunction1(value))
    
    inline def getTestID(value: /* props */ Route => js.UndefOr[String]): this.type = set("getTestID", js.Any.fromFunction1(value))
    
    inline def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    
    inline def keyboardHidesNavigationBar(value: Boolean): this.type = set("keyboardHidesNavigationBar", value.asInstanceOf[js.Any])
    
    inline def labelMaxFontSizeMultiplier(value: Double): this.type = set("labelMaxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def labeled(value: Boolean): this.type = set("labeled", value.asInstanceOf[js.Any])
    
    inline def onTabPress(value: /* props */ routeRouteTabPressEvent => Callback): this.type = set("onTabPress", js.Any.fromFunction1((t0: /* props */ routeRouteTabPressEvent) => value(t0).runNow()))
    
    inline def renderIcon(value: /* props */ Focused => Node): this.type = set("renderIcon", js.Any.fromFunction1(value))
    
    inline def renderLabel(value: /* props */ Focused => Node): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    inline def renderTouchable(value: /* props */ TouchableProps => Node): this.type = set("renderTouchable", js.Any.fromFunction1(value))
    
    inline def safeAreaInsets(value: Bottom): this.type = set("safeAreaInsets", value.asInstanceOf[js.Any])
    
    inline def sceneAnimationEnabled(value: Boolean): this.type = set("sceneAnimationEnabled", value.asInstanceOf[js.Any])
    
    inline def shifting(value: Boolean): this.type = set("shifting", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsstylenavigationS): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
