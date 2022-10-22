package typingsJapgolly.reactDates.components

import typingsJapgolly.reactDates.mod.CalendarMonthCls
import typingsJapgolly.reactDates.mod.CalendarMonthShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CalendarMonth {
  
  def apply(p: CalendarMonthShape): typingsJapgolly.StBuildingComponent.Default[CalendarMonthCls] = new typingsJapgolly.StBuildingComponent.Default[CalendarMonthCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates", "CalendarMonth")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalendarMonth.type): typingsJapgolly.StBuildingComponent.Default[CalendarMonthCls] = new typingsJapgolly.StBuildingComponent.Default[CalendarMonthCls](js.Array(this.component, js.Dictionary.empty))()
}
