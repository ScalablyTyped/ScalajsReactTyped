package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrap.libPopoverMod.PopoverProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("react-bootstrap", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.Popover] {
    
    inline def arrowOffsetLeft(value: Double | String): this.type = set("arrowOffsetLeft", value.asInstanceOf[js.Any])
    
    inline def arrowOffsetTop(value: Double | String): this.type = set("arrowOffsetTop", value.asInstanceOf[js.Any])
    
    inline def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    inline def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    inline def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    
    inline def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def positionLeft(value: Double | String): this.type = set("positionLeft", value.asInstanceOf[js.Any])
    
    inline def positionTop(value: Double | String): this.type = set("positionTop", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
