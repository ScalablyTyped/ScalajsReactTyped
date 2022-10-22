package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libCollapseCollapseMod.CollapseProps
import typingsJapgolly.antd.libCollapseCollapseMod.ExpandIconPosition
import typingsJapgolly.antd.libCollapseCollapseMod.PanelProps
import typingsJapgolly.antd.libCollapseCollapsePanelMod.CollapsePanelProps
import typingsJapgolly.antd.libCollapseCollapsePanelMod.CollapsibleType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  object Panel {
    
    @JSImport("antd", "Collapse.Panel")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps_208192475 = new SharedBuilder_CollapsePanelProps_208192475(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps_208192475 = new SharedBuilder_CollapsePanelProps_208192475(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    inline def activeKey(value: (js.Array[String | Double]) | String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def activeKeyVarargs(value: (String | Double)*): this.type = set("activeKey", js.Array(value*))
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsible(value: CollapsibleType): this.type = set("collapsible", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKey(value: (js.Array[String | Double]) | String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKeyVarargs(value: (String | Double)*): this.type = set("defaultActiveKey", js.Array(value*))
    
    inline def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    inline def expandIcon(value: /* panelProps */ PanelProps => japgolly.scalajs.react.facade.React.Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    inline def expandIconPosition(value: ExpandIconPosition): this.type = set("expandIconPosition", value.asInstanceOf[js.Any])
    
    inline def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* key */ String | js.Array[String] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* key */ String | js.Array[String]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
