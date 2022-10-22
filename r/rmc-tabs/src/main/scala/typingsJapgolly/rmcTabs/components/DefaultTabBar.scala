package typingsJapgolly.rmcTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcTabs.libDefaultTabBarMod.PropsType
import typingsJapgolly.rmcTabs.libModelsMod.Models.TabData
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
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
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.rmcTabs.mod.DefaultTabBar] {
    
    inline def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Callback): this.type = set("onTabClick", js.Any.fromFunction2((t0: /* tab */ TabData, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def renderTab(value: /* tab */ TabData => Node): this.type = set("renderTab", js.Any.fromFunction1(value))
    
    inline def renderUnderline(value: /* style */ CSSProperties | Any => Node): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    
    inline def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom | left | right): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyle(value: CSSProperties | Any): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarUnderlineStyle(value: CSSProperties | Any): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
