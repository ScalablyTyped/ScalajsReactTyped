package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDayPicker.mod.DayPickerRangeProps
import typingsJapgolly.reactDayPicker.mod.SelectRangeProviderInternalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectRangeProviderInternal {
  
  inline def apply(initialProps: DayPickerRangeProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SelectRangeProviderInternalProps]))
  }
  
  @JSImport("react-day-picker", "SelectRangeProviderInternal")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SelectRangeProviderInternalProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
