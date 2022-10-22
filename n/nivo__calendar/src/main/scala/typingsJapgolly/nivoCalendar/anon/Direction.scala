package typingsJapgolly.nivoCalendar.anon

import typingsJapgolly.nivoCalendar.nivoCalendarStrings.after
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.before
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.horizontal
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction[Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */] extends StObject {
  
  var direction: horizontal | vertical
  
  var monthLegendOffset: Double
  
  var monthLegendPosition: before | after
  
  var months: js.Array[Month]
}
object Direction {
  
  inline def apply[Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */](
    direction: horizontal | vertical,
    monthLegendOffset: Double,
    monthLegendPosition: before | after,
    months: js.Array[Month]
  ): Direction[Month] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], monthLegendOffset = monthLegendOffset.asInstanceOf[js.Any], monthLegendPosition = monthLegendPosition.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction[Month]]
  }
  
  extension [Self <: Direction[?], Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */](x: Self & Direction[Month]) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendOffset(value: Double): Self = StObject.set(x, "monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendPosition(value: before | after): Self = StObject.set(x, "monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: js.Array[Month]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsVarargs(value: Month*): Self = StObject.set(x, "months", js.Array(value*))
  }
}
