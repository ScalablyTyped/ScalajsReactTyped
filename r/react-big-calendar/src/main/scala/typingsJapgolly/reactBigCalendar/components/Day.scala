package typingsJapgolly.reactBigCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactBigCalendar.mod.DayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Day {
  
  inline def apply(date: js.Date): Default[typingsJapgolly.reactBigCalendar.mod.Day] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactBigCalendar.mod.Day](js.Array(this.component, __props.asInstanceOf[DayProps]))
  }
  
  @JSImport("react-big-calendar", "Day")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DayProps): Default[typingsJapgolly.reactBigCalendar.mod.Day] = new Default[typingsJapgolly.reactBigCalendar.mod.Day](js.Array(this.component, p.asInstanceOf[js.Any]))
}
