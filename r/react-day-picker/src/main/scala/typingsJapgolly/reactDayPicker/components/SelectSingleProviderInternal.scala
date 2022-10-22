package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayPickerSingleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectSingleProviderInternal {
  
  inline def apply(initialProps: DayPickerSingleProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactDayPicker.mod.SelectSingleProviderInternal]))
  }
  
  @JSImport("react-day-picker", "SelectSingleProviderInternal")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: typingsJapgolly.reactDayPicker.mod.SelectSingleProviderInternal): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
