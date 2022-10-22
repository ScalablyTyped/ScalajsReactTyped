package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.RowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Row {
  
  inline def apply(dates: js.Array[js.Date], displayMonth: js.Date, weekNumber: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RowProps]))
  }
  
  @JSImport("react-day-picker", "Row")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RowProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
