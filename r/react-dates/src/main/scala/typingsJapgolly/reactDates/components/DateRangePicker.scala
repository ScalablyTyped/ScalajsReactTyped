package typingsJapgolly.reactDates.components

import typingsJapgolly.reactDates.mod.DateRangePickerCls
import typingsJapgolly.reactDates.mod.DateRangePickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object DateRangePicker {
  
  def apply(p: DateRangePickerShape): typingsJapgolly.StBuildingComponent.Default[DateRangePickerCls] = new typingsJapgolly.StBuildingComponent.Default[DateRangePickerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates", "DateRangePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DateRangePicker.type): typingsJapgolly.StBuildingComponent.Default[DateRangePickerCls] = new typingsJapgolly.StBuildingComponent.Default[DateRangePickerCls](js.Array(this.component, js.Dictionary.empty))()
}
