package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.visible
import typingsJapgolly.gestalt.mod.FieldsetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fieldset {
  
  inline def apply(legend: String): Builder = {
    val __props = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FieldsetProps]))
  }
  
  @JSImport("gestalt", "Fieldset")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def legendDisplay(value: visible | hidden): this.type = set("legendDisplay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldsetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
