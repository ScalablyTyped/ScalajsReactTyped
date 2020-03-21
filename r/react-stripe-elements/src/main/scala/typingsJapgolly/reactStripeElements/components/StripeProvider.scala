package typingsJapgolly.reactStripeElements.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StripeProvider {
  def apiKeystringstripeneverSt(
    apiKey: String,
    stripeAccount: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactStripeElements.apiKeystringstripeneverSt, 
    typingsJapgolly.reactStripeElements.mod.StripeProvider, 
    Unit, 
    typingsJapgolly.reactStripeElements.apiKeystringstripeneverSt
  ] = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
  
      if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStripeElements.apiKeystringstripeneverSt, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStripeElements.mod.StripeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStripeElements.apiKeystringstripeneverSt])(children: _*)
  }
  def apiKeyneverstripeStripenu(
    stripe: Stripe = null,
    stripeAccount: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactStripeElements.apiKeyneverstripeStripenu, 
    typingsJapgolly.reactStripeElements.mod.StripeProvider, 
    Unit, 
    typingsJapgolly.reactStripeElements.apiKeyneverstripeStripenu
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStripeElements.apiKeyneverstripeStripenu, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStripeElements.mod.StripeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStripeElements.apiKeyneverstripeStripenu])(children: _*)
  }
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  object componentImport extends js.Object
  
}

