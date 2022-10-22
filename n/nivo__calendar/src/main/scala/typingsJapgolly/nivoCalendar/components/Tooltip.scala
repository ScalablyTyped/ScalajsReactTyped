package typingsJapgolly.nivoCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(color: String, day: String, value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasValueDayColor */ CalendarTooltipProps]))
  }
  
  @JSImport("@nivo/calendar", "timeRangeDefaultProps.tooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasValueDayColor */ CalendarTooltipProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
