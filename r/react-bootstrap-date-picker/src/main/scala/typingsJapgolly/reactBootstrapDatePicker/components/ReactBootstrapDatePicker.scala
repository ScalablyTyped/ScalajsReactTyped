package typingsJapgolly.reactBootstrapDatePicker.components

import typingsJapgolly.reactBootstrapDatePicker.mod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapDatePicker {
  
  object Class {
    
    @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Class.type): SharedBuilder_DatePickerProps_968846424[typingsJapgolly.reactBootstrapDatePicker.mod.Class] = new SharedBuilder_DatePickerProps_968846424[typingsJapgolly.reactBootstrapDatePicker.mod.Class](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DatePickerProps): SharedBuilder_DatePickerProps_968846424[typingsJapgolly.reactBootstrapDatePicker.mod.Class] = new SharedBuilder_DatePickerProps_968846424[typingsJapgolly.reactBootstrapDatePicker.mod.Class](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactBootstrapDatePicker.type): SharedBuilder_DatePickerPropsObject_15093951 = new SharedBuilder_DatePickerPropsObject_15093951(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps & js.Object): SharedBuilder_DatePickerPropsObject_15093951 = new SharedBuilder_DatePickerPropsObject_15093951(js.Array(this.component, p.asInstanceOf[js.Any]))
}
