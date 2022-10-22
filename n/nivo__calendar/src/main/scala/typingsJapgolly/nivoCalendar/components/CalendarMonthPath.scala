package typingsJapgolly.nivoCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarMonthPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarMonthPath {
  
  inline def apply(borderColor: String, borderWidth: Double, path: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasPathBorderWidthBorderColor */ CalendarMonthPathProps]))
  }
  
  @JSImport("@nivo/calendar/dist/types/CalendarMonthPath", "CalendarMonthPath")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasPathBorderWidthBorderColor */ CalendarMonthPathProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
