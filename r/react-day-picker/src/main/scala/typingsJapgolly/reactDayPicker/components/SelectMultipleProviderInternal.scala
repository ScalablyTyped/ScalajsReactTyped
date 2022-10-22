package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayPickerMultipleProps
import typingsJapgolly.reactDayPicker.mod.SelectMultipleProviderInternalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectMultipleProviderInternal {
  
  inline def apply(initialProps: DayPickerMultipleProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SelectMultipleProviderInternalProps]))
  }
  
  @JSImport("react-day-picker", "SelectMultipleProviderInternal")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SelectMultipleProviderInternalProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
