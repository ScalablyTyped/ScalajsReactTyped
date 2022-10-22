package typingsJapgolly.reactPaymentInputs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPaymentInputs.anon.ErrorText
import typingsJapgolly.reactPaymentInputs.mod.PaymentInputsWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaymentInputsWrapper {
  
  inline def apply(error: String, focused: Boolean, isTouched: Boolean): Builder = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaymentInputsWrapperProps]))
  }
  
  @JSImport("react-payment-inputs", "PaymentInputsWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def styles(value: ErrorText): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaymentInputsWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
