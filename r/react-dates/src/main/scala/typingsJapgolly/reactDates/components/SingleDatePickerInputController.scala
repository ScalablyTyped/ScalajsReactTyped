package typingsJapgolly.reactDates.components

import typingsJapgolly.reactDates.mod.SingleDatePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleDatePickerInputController {
  
  inline def apply(id: String): SharedBuilder_SingleDatePickerInputShape1360821916 = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new SharedBuilder_SingleDatePickerInputShape1360821916(js.Array(this.component, __props.asInstanceOf[SingleDatePickerInputShape]))
  }
  
  @JSImport("react-dates/lib/components/SingleDatePickerInputController", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SingleDatePickerInputShape): SharedBuilder_SingleDatePickerInputShape1360821916 = new SharedBuilder_SingleDatePickerInputShape1360821916(js.Array(this.component, p.asInstanceOf[js.Any]))
}
