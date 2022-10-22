package typingsJapgolly.reactPaymentInputs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPaymentInputs.anon.CardNumberCardType
import typingsJapgolly.reactPaymentInputs.anon.CardType
import typingsJapgolly.reactPaymentInputs.anon.ExpiryDate
import typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
import typingsJapgolly.reactPaymentInputs.mod.ErroredInputs
import typingsJapgolly.reactPaymentInputs.mod.usePaymentInputsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaymentInputsContainer {
  
  @JSImport("react-payment-inputs", "PaymentInputsContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def cardNumberValidator(value: /* props */ CardNumberCardType => String): this.type = set("cardNumberValidator", js.Any.fromFunction1(value))
    
    inline def cvcValidator(value: /* props */ CardType => String): this.type = set("cvcValidator", js.Any.fromFunction1(value))
    
    inline def errorMessages(value: ErrorMessages): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    inline def expiryValidator(value: /* props */ ExpiryDate => String): this.type = set("expiryValidator", js.Any.fromFunction1(value))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onError(value: (/* error */ String, /* erroredInputs */ ErroredInputs) => Callback): this.type = set("onError", js.Any.fromFunction2((t0: /* error */ String, t1: /* erroredInputs */ ErroredInputs) => (value(t0, t1)).runNow()))
    
    inline def onTouch(value: Any): this.type = set("onTouch", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PaymentInputsContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: usePaymentInputsOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
