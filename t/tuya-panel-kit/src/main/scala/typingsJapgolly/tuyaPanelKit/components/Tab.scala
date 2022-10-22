package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.TabProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("tuya-panel-kit", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Tab] {
    
    inline def activeKey(value: String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKey(value: String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def distanceToChangeTab(value: Double): this.type = set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* activeKey */ js.UndefOr[Double | String] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* activeKey */ js.UndefOr[Double | String]) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    inline def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarStyleNull: this.type = set("tabBarStyle", null)
    
    inline def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    
    inline def tabContentStyle(value: StyleProp[ViewStyle]): this.type = set("tabContentStyle", value.asInstanceOf[js.Any])
    
    inline def tabContentStyleNull: this.type = set("tabContentStyle", null)
    
    inline def tabDefaultColor(value: String): this.type = set("tabDefaultColor", value.asInstanceOf[js.Any])
    
    inline def tabNavAccessibilityLabel(value: String): this.type = set("tabNavAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabStyleNull: this.type = set("tabStyle", null)
    
    inline def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    inline def tabsContainerStyle(value: StyleProp[ViewStyle]): this.type = set("tabsContainerStyle", value.asInstanceOf[js.Any])
    
    inline def tabsContainerStyleNull: this.type = set("tabsContainerStyle", null)
    
    inline def useViewPagerOnAndroid(value: Boolean): this.type = set("useViewPagerOnAndroid", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
