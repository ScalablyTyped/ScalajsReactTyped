package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.column
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.row
import typingsJapgolly.gestalt.gestaltStrings.visible
import typingsJapgolly.gestalt.mod.RadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  inline def apply(id: String, legend: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioGroupProps]))
  }
  
  @JSImport("gestalt", "RadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def direction(value: column | row): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def legendDisplay(value: visible | hidden): this.type = set("legendDisplay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
