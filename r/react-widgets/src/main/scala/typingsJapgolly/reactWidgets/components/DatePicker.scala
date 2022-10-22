package typingsJapgolly.reactWidgets.components

import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactWidgets.esmDatePickerMod.DatePickerHandle
import typingsJapgolly.reactWidgets.esmDatePickerMod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("react-widgets/esm", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePicker.type): SharedBuilder_DatePickerPropsRefAttributes2034774610[DatePickerHandle] = new SharedBuilder_DatePickerPropsRefAttributes2034774610[DatePickerHandle](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps[Any] & RefAttributes[DatePickerHandle]): SharedBuilder_DatePickerPropsRefAttributes2034774610[DatePickerHandle] = new SharedBuilder_DatePickerPropsRefAttributes2034774610[DatePickerHandle](js.Array(this.component, p.asInstanceOf[js.Any]))
}
