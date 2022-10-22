package typingsJapgolly.reactDates.components

import typingsJapgolly.reactDates.mod.CalendarMonthGridCls
import typingsJapgolly.reactDates.mod.CalendarMonthGridShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CalendarMonthGrid {
  
  def apply(p: CalendarMonthGridShape): typingsJapgolly.StBuildingComponent.Default[CalendarMonthGridCls] = new typingsJapgolly.StBuildingComponent.Default[CalendarMonthGridCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates", "CalendarMonthGrid")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalendarMonthGrid.type): typingsJapgolly.StBuildingComponent.Default[CalendarMonthGridCls] = new typingsJapgolly.StBuildingComponent.Default[CalendarMonthGridCls](js.Array(this.component, js.Dictionary.empty))()
}
