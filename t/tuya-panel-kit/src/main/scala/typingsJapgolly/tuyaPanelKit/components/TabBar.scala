package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.TabBarArr
import typingsJapgolly.tuyaPanelKit.mod.TabBarProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  inline def apply(tabs: js.Array[TabBarArr]): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabBarProps]))
  }
  
  @JSImport("tuya-panel-kit", "TabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.TabBar] {
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def activeKey(value: String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def defaultActiveIndex(value: Double): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKey(value: String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def isUnderlineCenter(value: Boolean): this.type = set("isUnderlineCenter", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* index */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* index */ String) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def tabActiveStyle(value: StyleProp[ViewStyle]): this.type = set("tabActiveStyle", value.asInstanceOf[js.Any])
    
    inline def tabActiveStyleNull: this.type = set("tabActiveStyle", null)
    
    inline def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    inline def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabStyleNull: this.type = set("tabStyle", null)
    
    inline def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    inline def `type`(value: radio | String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: StyleProp[ViewStyle]): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def underlineStyleNull: this.type = set("underlineStyle", null)
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: TabBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
