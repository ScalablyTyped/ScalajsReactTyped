package typingsJapgolly.reactCreditCards.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCreditCards.AnonName
import typingsJapgolly.reactCreditCards.AnonValid
import typingsJapgolly.reactCreditCards.mod.CallbackArgument
import typingsJapgolly.reactCreditCards.mod.Focused
import typingsJapgolly.reactCreditCards.mod.ReactCreditCardProps
import typingsJapgolly.reactCreditCards.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCreditCards {
  def apply(
    cvc: String | Double,
    expiry: String | Double,
    name: String,
    number: String | Double,
    acceptedCards: js.Array[String] = null,
    callback: (/* type */ CallbackArgument, /* isValid */ Boolean) => Callback = null,
    focused: Focused = null,
    issuer: String = null,
    locale: AnonValid = null,
    placeholders: AnonName = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactCreditCardProps, default, Unit, ReactCreditCardProps] = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
      if (acceptedCards != null) __obj.updateDynamic("acceptedCards")(acceptedCards.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* type */ typingsJapgolly.reactCreditCards.mod.CallbackArgument, t1: /* isValid */ scala.Boolean) => callback(t0, t1).runNow()))
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCreditCards.mod.ReactCreditCardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCreditCards.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCreditCards.mod.ReactCreditCardProps])(children: _*)
  }
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

