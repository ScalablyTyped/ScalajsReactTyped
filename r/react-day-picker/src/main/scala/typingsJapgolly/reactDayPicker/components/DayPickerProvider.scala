package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayPickerProps
import typingsJapgolly.reactDayPicker.mod.DayPickerProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DayPickerProvider {
  
  inline def apply(initialProps: DayPickerProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DayPickerProviderProps]))
  }
  
  @JSImport("react-day-picker", "DayPickerProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DayPickerProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
