package typingsJapgolly.nivoCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarYearLegendsProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.YearLegend
import typingsJapgolly.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarYearLegends {
  
  inline def apply(legend: Double => String | Double, theme: CompleteTheme, years: js.Array[YearLegend]): Default[js.Object] = {
    val __props = js.Dynamic.literal(legend = js.Any.fromFunction1(legend), theme = theme.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasYearsLegendTheme */ CalendarYearLegendsProps]))
  }
  
  @JSImport("@nivo/calendar/dist/types/CalendarYearLegends", "CalendarYearLegends")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasYearsLegendTheme */ CalendarYearLegendsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
