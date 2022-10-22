package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayPickerBase
import typingsJapgolly.reactDayPicker.mod.SelectMultipleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectMultipleProvider {
  
  inline def apply(initialProps: DayPickerBase): Default[js.Object] = {
    val __props = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SelectMultipleProviderProps]))
  }
  
  @JSImport("react-day-picker", "SelectMultipleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SelectMultipleProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
