package typingsJapgolly.blueprintjsDatetime.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsDatetime.libEsmDatePickerNavbarMod.IDatePickerNavbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerNavbar {
  
  inline def apply(maxDate: js.Date, minDate: js.Date): Builder = {
    val __props = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDatePickerNavbarProps]))
  }
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.libEsmDatePickerNavbarMod.DatePickerNavbar] {
    
    inline def hideLeftNavButton(value: Boolean): this.type = set("hideLeftNavButton", value.asInstanceOf[js.Any])
    
    inline def hideRightNavButton(value: Boolean): this.type = set("hideRightNavButton", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDatePickerNavbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
