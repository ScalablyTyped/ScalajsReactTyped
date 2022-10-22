package typingsJapgolly.reactStripeElements.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.HTMLStripeElement
import typingsJapgolly.stripeV3.anon.Base
import typingsJapgolly.stripeV3.anon.Complete
import typingsJapgolly.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsJapgolly.stripeV3.stripeV3Strings.default
import typingsJapgolly.stripeV3.stripeV3Strings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ElementProps_1851865827[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def classes(value: Base): this.type = set("classes", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def elementRef(value: /* ref */ Any => Callback): this.type = set("elementRef", js.Any.fromFunction1((t0: /* ref */ Any) => value(t0).runNow()))
  
  inline def hideIcon(value: Boolean): this.type = set("hideIcon", value.asInstanceOf[js.Any])
  
  inline def hidePostalCode(value: Boolean): this.type = set("hidePostalCode", value.asInstanceOf[js.Any])
  
  inline def iconStyle(value: solid | default): this.type = set("iconStyle", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def onBlur(value: /* event */ ElementChangeResponse => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
  
  inline def onChange(value: /* event */ ElementChangeResponse => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
  
  inline def onFocus(value: /* event */ ElementChangeResponse => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
  
  inline def onReady(value: /* el */ HTMLStripeElement => Callback): this.type = set("onReady", js.Any.fromFunction1((t0: /* el */ HTMLStripeElement) => value(t0).runNow()))
  
  inline def paymentRequest(value: StripePaymentRequest): this.type = set("paymentRequest", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def placeholderCountry(value: String): this.type = set("placeholderCountry", value.asInstanceOf[js.Any])
  
  inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
  
  inline def style(value: Complete): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def supportedCountries(value: js.Array[String]): this.type = set("supportedCountries", value.asInstanceOf[js.Any])
  
  inline def supportedCountriesVarargs(value: String*): this.type = set("supportedCountries", js.Array(value*))
  
  inline def value(value: String | StringDictionary[String]): this.type = set("value", value.asInstanceOf[js.Any])
}
