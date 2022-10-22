package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Day {
  
  inline def apply(date: js.Date, displayMonth: js.Date): Default[js.Object] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DayProps]))
  }
  
  @JSImport("react-day-picker", "Day")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DayProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
