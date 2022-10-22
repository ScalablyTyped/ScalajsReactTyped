package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSidebarSectionItemMod.SidebarSectionItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarSectionItem {
  
  @JSImport("wix-style-react", "SidebarSectionItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SidebarSectionItem] {
    
    inline def alwaysDisplayChevron(value: Boolean): this.type = set("alwaysDisplayChevron", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def drillable(value: Boolean): this.type = set("drillable", value.asInstanceOf[js.Any])
    
    inline def itemKey(value: String): this.type = set("itemKey", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SidebarSectionItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarSectionItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
