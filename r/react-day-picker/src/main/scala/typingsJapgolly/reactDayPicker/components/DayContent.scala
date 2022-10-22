package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.ActiveModifiers
import typingsJapgolly.reactDayPicker.mod.DayContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DayContent {
  
  inline def apply(activeModifiers: ActiveModifiers, date: js.Date, displayMonth: js.Date): Default[js.Object] = {
    val __props = js.Dynamic.literal(activeModifiers = activeModifiers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DayContentProps]))
  }
  
  @JSImport("react-day-picker", "DayContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DayContentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
