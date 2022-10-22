package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.left
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.right
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.libTabsDefaultTabBarMod.PropsType
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.TabData
import typingsJapgolly.antDesignReactNative.libTabsStyleMod.TabBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultTabBar {
  
  inline def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Callback,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): Builder = {
    val __props = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1((t0: Double) => goToTab(t0).runNow()), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.libTabsDefaultTabBarMod.DefaultTabBar] {
    
    inline def keyboardShouldPersistTaps(value: Boolean): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Callback): this.type = set("onTabClick", js.Any.fromFunction2((t0: /* tab */ TabData, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def renderTab(value: /* tab */ TabData => Node): this.type = set("renderTab", js.Any.fromFunction1(value))
    
    inline def renderUnderline(value: /* style */ Any => Node): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    
    inline def scrollValue(value: Any): this.type = set("scrollValue", value.asInstanceOf[js.Any])
    
    inline def styles(value: Partial[TabBarStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom | left | right): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    
    inline def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    
    inline def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabsContainerStyle(value: ViewStyle): this.type = set("tabsContainerStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
