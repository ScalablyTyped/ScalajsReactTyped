package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsDatetime.libEsmDatePickerCaptionMod.IDatePickerCaptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerCaption {
  
  inline def apply(maxDate: js.Date, minDate: js.Date): Builder = {
    val __props = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDatePickerCaptionProps]))
  }
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.libEsmDatePickerCaptionMod.DatePickerCaption] {
    
    inline def onDateChange(value: /* date */ js.Date => Callback): this.type = set("onDateChange", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
    
    inline def onMonthChange(value: /* month */ Double => Callback): this.type = set("onMonthChange", js.Any.fromFunction1((t0: /* month */ Double) => value(t0).runNow()))
    
    inline def onYearChange(value: /* year */ Double => Callback): this.type = set("onYearChange", js.Any.fromFunction1((t0: /* year */ Double) => value(t0).runNow()))
    
    inline def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDatePickerCaptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
