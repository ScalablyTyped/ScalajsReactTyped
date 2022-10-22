package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpointsComponents
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.tabbedViewMod.TabProps
import typingsJapgolly.cathoQuantum.tabbedViewMod.TabbedViewProps
import typingsJapgolly.cathoQuantum.tabbedViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbedView {
  
  object Tab {
    
    inline def apply(title: String): typingsJapgolly.cathoQuantum.components.TabbedView.Tab.Builder = {
      val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.TabbedView.Tab.Builder(js.Array(this.component, __props.asInstanceOf[TabProps & js.Object]))
    }
    
    @JSImport("@catho/quantum/TabbedView", "default.Tab")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def badge(value: VdomNode): this.type = set("badge", value.rawNode.asInstanceOf[js.Any])
      
      inline def badgeNull: this.type = set("badge", null)
      
      inline def badgeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("badge", js.Array(value*))
      
      inline def badgeVdomElement(value: VdomElement): this.type = set("badge", value.rawElement.asInstanceOf[js.Any])
      
      inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def iconNull: this.type = set("icon", null)
      
      inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    }
    
    def withProps(p: TabProps & js.Object): typingsJapgolly.cathoQuantum.components.TabbedView.Tab.Builder = new typingsJapgolly.cathoQuantum.components.TabbedView.Tab.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/TabbedView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeTab(value: String): this.type = set("activeTab", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def onTabClick(value: Callback): this.type = set("onTabClick", value.toJsFn)
    
    inline def skin(value: neutral | primary): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSizeBreakpointsComponents): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabbedView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabbedViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
