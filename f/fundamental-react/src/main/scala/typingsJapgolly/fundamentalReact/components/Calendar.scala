package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.NextMonth
import typingsJapgolly.fundamentalReact.libCalendarCalendarMod.CalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("fundamental-react", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.Calendar] {
    
    inline def blockedDates(value: js.Array[js.Date]): this.type = set("blockedDates", value.asInstanceOf[js.Any])
    
    inline def blockedDatesVarargs(value: js.Date*): this.type = set("blockedDates", js.Array(value*))
    
    inline def disableAfterDate(value: js.Date): this.type = set("disableAfterDate", value.asInstanceOf[js.Any])
    
    inline def disableBeforeDate(value: js.Date): this.type = set("disableBeforeDate", value.asInstanceOf[js.Any])
    
    inline def disableFutureDates(value: Boolean): this.type = set("disableFutureDates", value.asInstanceOf[js.Any])
    
    inline def disablePastDates(value: Boolean): this.type = set("disablePastDates", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disableWeekday(value: js.Array[String]): this.type = set("disableWeekday", value.asInstanceOf[js.Any])
    
    inline def disableWeekdayVarargs(value: String*): this.type = set("disableWeekday", js.Array(value*))
    
    inline def disableWeekends(value: Boolean): this.type = set("disableWeekends", value.asInstanceOf[js.Any])
    
    inline def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    inline def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value*))
    
    inline def localizedText(value: NextMonth): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* date */ js.Date => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
