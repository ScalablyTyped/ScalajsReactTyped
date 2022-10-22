package typingsJapgolly.reactMdTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdTabs.typesTabsManagerMod.TabsManagerProps
import typingsJapgolly.reactMdTabs.typesTypesMod.TabConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabsManager {
  
  inline def apply(tabs: js.Array[TabConfig | Element | String], tabsId: String): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsManagerProps]))
  }
  
  @JSImport("@react-md/tabs", "TabsManager")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def defaultActiveIndex(value: Double): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    
    inline def onActiveIndexChange(value: /* activeIndex */ Double => Callback): this.type = set("onActiveIndexChange", js.Any.fromFunction1((t0: /* activeIndex */ Double) => value(t0).runNow()))
    
    inline def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
