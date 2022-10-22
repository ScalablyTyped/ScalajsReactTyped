package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTypeahead.mod.MenuProps
import typingsJapgolly.reactBootstrapTypeahead.mod.OverlayProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  inline def apply(container: HTMLElement): Builder = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("react-bootstrap-typeahead", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.Overlay] {
    
    inline def align(value: TypeaheadAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def children(value: /* menuProps */ MenuProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def isMenuShown(value: Boolean): this.type = set("isMenuShown", value.asInstanceOf[js.Any])
    
    inline def onMenuToggle(value: /* show */ Boolean => Callback): this.type = set("onMenuToggle", js.Any.fromFunction1((t0: /* show */ Boolean) => value(t0).runNow()))
    
    inline def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    
    inline def referenceElement(value: HTMLElement): this.type = set("referenceElement", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
