package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.TabBarPropsType
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.TabData
import typingsJapgolly.antDesignReactNative.libTabsStyleTabsMod.TabsStyle
import typingsJapgolly.antDesignReactNative.libTabsTabsMod.TabsProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(tabs: js.Array[TabData]): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
  
  @JSImport("@ant-design/react-native", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Tabs] {
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def destroyInactiveTab(value: Boolean): this.type = set("destroyInactiveTab", value.asInstanceOf[js.Any])
    
    inline def distanceToChangeTab(value: Double): this.type = set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    inline def initialPage(value: Double | String): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    inline def keyboardShouldPersistTaps(value: Boolean): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def noRenderContent(value: Boolean): this.type = set("noRenderContent", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* tab */ TabData, /* index */ Double) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* tab */ TabData, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Callback): this.type = set("onTabClick", js.Any.fromFunction2((t0: /* tab */ TabData, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def page(value: Double | String): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def prerenderingSiblingsNumber(value: Double): this.type = set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    inline def renderTab(value: /* tab */ TabData => Node): this.type = set("renderTab", js.Any.fromFunction1(value))
    
    inline def renderTabBar(value: (js.Function1[/* props */ TabBarPropsType, Node]) | `false`): this.type = set("renderTabBar", value.asInstanceOf[js.Any])
    
    inline def renderTabBarFunction1(value: /* props */ TabBarPropsType => Node): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    inline def renderUnderline(value: /* style */ Any => Node): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[TabsStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    
    inline def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    
    inline def tabDirection(value: horizontal | vertical): this.type = set("tabDirection", value.asInstanceOf[js.Any])
    
    inline def useLeftInsteadTransform(value: Boolean): this.type = set("useLeftInsteadTransform", value.asInstanceOf[js.Any])
    
    inline def useOnPan(value: Boolean): this.type = set("useOnPan", value.asInstanceOf[js.Any])
    
    inline def usePaged(value: Boolean): this.type = set("usePaged", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
