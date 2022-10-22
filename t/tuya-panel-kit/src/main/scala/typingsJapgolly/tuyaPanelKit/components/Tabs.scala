package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.Easing
import typingsJapgolly.tuyaPanelKit.mod.TabDataSource
import typingsJapgolly.tuyaPanelKit.mod.TabsProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(dataSource: js.Array[TabDataSource]): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
  
  @JSImport("tuya-panel-kit", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Tabs] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def activeKey(value: Double | String): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def animationConfig(value: Easing): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKey(value: Double | String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def extraSpace(value: Double): this.type = set("extraSpace", value.asInstanceOf[js.Any])
    
    inline def maxItem(value: Double): this.type = set("maxItem", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* tab */ TabDataSource, t1: /* idx */ Double) => (value(t0, t1)).runNow()))
    
    inline def preload(value: Boolean): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def preloadTimeout(value: Double): this.type = set("preloadTimeout", value.asInstanceOf[js.Any])
    
    inline def renderPlaceholder(value: (/* activeIndex */ Double, /* child */ Node) => Node): this.type = set("renderPlaceholder", js.Any.fromFunction2(value))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def tabActiveStyle(value: StyleProp[ViewStyle]): this.type = set("tabActiveStyle", value.asInstanceOf[js.Any])
    
    inline def tabActiveStyleNull: this.type = set("tabActiveStyle", null)
    
    inline def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    inline def tabContentStyle(value: StyleProp[ViewStyle]): this.type = set("tabContentStyle", value.asInstanceOf[js.Any])
    
    inline def tabContentStyleNull: this.type = set("tabContentStyle", null)
    
    inline def tabPosition(value: top | bottom): this.type = set("tabPosition", value.asInstanceOf[js.Any])
    
    inline def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabStyleNull: this.type = set("tabStyle", null)
    
    inline def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    inline def underlineStyle(value: StyleProp[ViewStyle]): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def underlineStyleNull: this.type = set("underlineStyle", null)
    
    inline def underlineWidth(value: Double): this.type = set("underlineWidth", value.asInstanceOf[js.Any])
    
    inline def velocityThreshold(value: Double): this.type = set("velocityThreshold", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
