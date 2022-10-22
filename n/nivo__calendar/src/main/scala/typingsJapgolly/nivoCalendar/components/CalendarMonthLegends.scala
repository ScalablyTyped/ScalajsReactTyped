package typingsJapgolly.nivoCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarMonthLegendsProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.MonthLegend
import typingsJapgolly.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarMonthLegends {
  
  inline def apply(
    legend: (Double, Double, js.Date) => String | Double,
    months: js.Array[MonthLegend],
    theme: CompleteTheme
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(legend = js.Any.fromFunction3(legend), months = months.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasMonthsLegendTheme */ CalendarMonthLegendsProps]))
  }
  
  @JSImport("@nivo/calendar/dist/types/CalendarMonthLegends", "CalendarMonthLegends")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasMonthsLegendTheme */ CalendarMonthLegendsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
