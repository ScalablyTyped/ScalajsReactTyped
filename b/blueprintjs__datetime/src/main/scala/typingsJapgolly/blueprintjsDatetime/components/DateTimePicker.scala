package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsDatetime.libEsmDatePickerMod.DatePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmDateTimePickerMod.IDateTimePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimePicker {
  
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.mod.DateTimePicker] {
    
    inline def canClearSelection(value: Boolean): this.type = set("canClearSelection", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def datePickerProps(value: DatePickerProps): this.type = set("datePickerProps", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* selectedDate */ js.Date, t1: /* isUserChange */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def timePickerProps(value: TimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: DateTimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
