package typingsJapgolly.rcTabs.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTabs.esTabPanelListTabPaneMod.TabPaneProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("rc-tabs/es/TabPanelList/TabPane", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: VdomNode): this.type = set("closeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def closeIconNull: this.type = set("closeIcon", null)
    
    inline def closeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("closeIcon", js.Array(value*))
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def destroyInactiveTabPane(value: Boolean): this.type = set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tab(value: VdomNode): this.type = set("tab", value.rawNode.asInstanceOf[js.Any])
    
    inline def tabKey(value: String): this.type = set("tabKey", value.asInstanceOf[js.Any])
    
    inline def tabNull: this.type = set("tab", null)
    
    inline def tabVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tab", js.Array(value*))
    
    inline def tabVdomElement(value: VdomElement): this.type = set("tab", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabPane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPaneProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
