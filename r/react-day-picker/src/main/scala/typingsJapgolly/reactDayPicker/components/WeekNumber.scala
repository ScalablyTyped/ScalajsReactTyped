package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.WeekNumberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WeekNumber {
  
  inline def apply(dates: js.Array[js.Date], number: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[WeekNumberProps]))
  }
  
  @JSImport("react-day-picker", "WeekNumber")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: WeekNumberProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
