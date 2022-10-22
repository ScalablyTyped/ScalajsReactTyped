package typingsJapgolly.nivoCalendar.anon

import typingsJapgolly.nivoCalendar.distTypesTypesMod.Year
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.after
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.before
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.horizontal
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'direction'> & {  offset :number,   position :'before' | 'after',   years :std.Array<@nivo/calendar.@nivo/calendar/dist/types/types.Year>} */
trait PickRequiredCalendarSvgPrOffset extends StObject {
  
  var direction: horizontal | vertical
  
  var offset: Double
  
  var position: before | after
  
  var years: js.Array[Year]
}
object PickRequiredCalendarSvgPrOffset {
  
  inline def apply(direction: horizontal | vertical, offset: Double, position: before | after, years: js.Array[Year]): PickRequiredCalendarSvgPrOffset = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrOffset]
  }
  
  extension [Self <: PickRequiredCalendarSvgPrOffset](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setYears(value: js.Array[Year]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsVarargs(value: Year*): Self = StObject.set(x, "years", js.Array(value*))
  }
}
