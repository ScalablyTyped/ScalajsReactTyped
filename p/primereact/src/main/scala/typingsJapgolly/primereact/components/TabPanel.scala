package typingsJapgolly.primereact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.tabviewTabviewMod.TabPanelHeaderTemplateOptions
import typingsJapgolly.primereact.tabviewTabviewMod.TabPanelHeaderTemplateType
import typingsJapgolly.primereact.tabviewTabviewMod.TabPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanel {
  
  @JSImport("primereact", "TabPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.TabPanel] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def header(value: VdomNode): this.type = set("header", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def headerTemplate(value: TabPanelHeaderTemplateType): this.type = set("headerTemplate", value.asInstanceOf[js.Any])
    
    inline def headerTemplateFunction1(value: /* options */ TabPanelHeaderTemplateOptions => Node): this.type = set("headerTemplate", js.Any.fromFunction1(value))
    
    inline def headerTemplateNull: this.type = set("headerTemplate", null)
    
    inline def headerTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerTemplate", js.Array(value*))
    
    inline def headerTemplateVdomElement(value: VdomElement): this.type = set("headerTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def leftIcon(value: String): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    inline def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
