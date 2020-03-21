package typingsJapgolly.reactStripeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementProps
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.HTMLStripeElement
import typingsJapgolly.stripeV3.AnonBase
import typingsJapgolly.stripeV3.AnonComplete
import typingsJapgolly.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsJapgolly.stripeV3.stripeV3Strings.default
import typingsJapgolly.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ElementProps1796642645[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    classes: AnonBase = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementRef: /* ref */ js.Any => Callback = null,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    id: String = null,
    onBlur: /* event */ ElementChangeResponse => Callback = null,
    onChange: /* event */ ElementChangeResponse => Callback = null,
    onFocus: /* event */ ElementChangeResponse => Callback = null,
    onReady: /* el */ HTMLStripeElement => Callback = null,
    paymentRequest: StripePaymentRequest = null,
    placeholder: String = null,
    placeholderCountry: String = null,
    style: AnonComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ElementProps, ComponentRef, Unit, ElementProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1((t0: /* ref */ js.Any) => elementRef(t0).runNow()))
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse) => onFocus(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* el */ typingsJapgolly.reactStripeElements.mod.ReactStripeElements.HTMLStripeElement) => onReady(t0).runNow()))
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementProps])(children: _*)
  }
}

