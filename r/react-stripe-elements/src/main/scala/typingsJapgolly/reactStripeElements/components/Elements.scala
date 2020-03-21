package typingsJapgolly.reactStripeElements.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stripeV3.stripe.elements.ElementsCreateOptions
import typingsJapgolly.stripeV3.stripe.elements.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elements {
  def apply(
    fonts: js.Array[Font] = null,
    locale: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ElementsCreateOptions, 
    typingsJapgolly.reactStripeElements.mod.Elements, 
    Unit, 
    ElementsCreateOptions
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stripeV3.stripe.elements.ElementsCreateOptions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStripeElements.mod.Elements](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stripeV3.stripe.elements.ElementsCreateOptions])(children: _*)
  }
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  object componentImport extends js.Object
  
}

