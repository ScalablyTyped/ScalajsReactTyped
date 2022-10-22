package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabMod.TabId
import typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabsMod.ITabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(id: TabId): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITabsProps]))
  }
  
  object Expander {
    
    @JSImport("@blueprintjs/core", "Tabs.Expander")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Expander.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@blueprintjs/core", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Tabs] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedTabId(value: TabId): this.type = set("defaultSelectedTabId", value.asInstanceOf[js.Any])
    
    inline def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* newTabId */ TabId, t1: /* prevTabId */ js.UndefOr[TabId], t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def renderActiveTabPanelOnly(value: Boolean): this.type = set("renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
    
    inline def selectedTabId(value: TabId): this.type = set("selectedTabId", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
