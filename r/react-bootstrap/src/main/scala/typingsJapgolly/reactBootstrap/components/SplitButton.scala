package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrap.libSplitButtonMod.SplitButtonProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SplitButton {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SplitButtonProps]))
  }
  
  @JSImport("react-bootstrap", "SplitButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.SplitButton] {
    
    inline def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    inline def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    
    inline def dropdownTitle(value: Any): this.type = set("dropdownTitle", value.asInstanceOf[js.Any])
    
    inline def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    inline def pullRight(value: Boolean): this.type = set("pullRight", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: SplitButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
