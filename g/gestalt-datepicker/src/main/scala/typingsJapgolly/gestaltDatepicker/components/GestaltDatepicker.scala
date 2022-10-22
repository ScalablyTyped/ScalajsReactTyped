package typingsJapgolly.gestaltDatepicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestaltDatepicker.anon.Event
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.down
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.end
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.left
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.right
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.start
import typingsJapgolly.gestaltDatepicker.gestaltDatepickerStrings.up
import typingsJapgolly.gestaltDatepicker.mod.DatePickerProps
import typingsJapgolly.gestaltDatepicker.mod.Locale
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GestaltDatepicker {
  
  inline def apply(id: String, onChange: Event => Callback): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Event) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DatePickerProps]))
  }
  
  @JSImport("gestalt-datepicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def excludeDates(value: js.Array[js.Date]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
    
    inline def excludeDatesVarargs(value: js.Date*): this.type = set("excludeDates", js.Array(value*))
    
    inline def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    inline def idealDirection(value: up | right | down | left): this.type = set("idealDirection", value.asInstanceOf[js.Any])
    
    inline def includeDates(value: js.Array[js.Date]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    
    inline def includeDatesVarargs(value: js.Date*): this.type = set("includeDates", js.Array(value*))
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def localeData(value: Locale): this.type = set("localeData", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nextRef(value: Ref[Any]): this.type = set("nextRef", value.asInstanceOf[js.Any])
    
    inline def nextRefFunction1(value: Any | Null => Callback): this.type = set("nextRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def nextRefNull: this.type = set("nextRef", null)
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def rangeEndDate(value: js.Date): this.type = set("rangeEndDate", value.asInstanceOf[js.Any])
    
    inline def rangeSelector(value: start | end): this.type = set("rangeSelector", value.asInstanceOf[js.Any])
    
    inline def rangeStartDate(value: js.Date): this.type = set("rangeStartDate", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
