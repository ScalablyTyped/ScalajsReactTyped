package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDayPicker.mod.CaptionLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CaptionLabel {
  
  inline def apply(displayMonth: js.Date): Builder = {
    val __props = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CaptionLabelProps]))
  }
  
  @JSImport("react-day-picker", "CaptionLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CaptionLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
