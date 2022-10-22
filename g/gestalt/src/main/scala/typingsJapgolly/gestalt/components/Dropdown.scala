package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.mod.DropdownProps
import typingsJapgolly.gestalt.mod.FourDirections
import typingsJapgolly.gestalt.mod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(children: Element | js.Array[Element], id: String, onDismiss: Callback): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  @JSImport("gestalt", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def anchor(value: HTMLElement): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def dangerouslyRemoveLayer(value: Boolean): this.type = set("dangerouslyRemoveLayer", value.asInstanceOf[js.Any])
    
    inline def headerContent(value: VdomNode): this.type = set("headerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerContentNull: this.type = set("headerContent", null)
    
    inline def headerContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerContent", js.Array(value*))
    
    inline def headerContentVdomElement(value: VdomElement): this.type = set("headerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def idealDirection(value: FourDirections): this.type = set("idealDirection", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Indexable): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
