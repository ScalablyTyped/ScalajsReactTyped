package typingsJapgolly.reactCurrencyFormatter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCurrencyFormatter.mod.CurrencyFormatterProps
import typingsJapgolly.reactCurrencyFormatter.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCurrencyFormatter {
  def apply(
    quantity: Double,
    currency: String = null,
    decimal: String = null,
    group: String = null,
    locale: String = null,
    pattern: String = null,
    symbol: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CurrencyFormatterProps, ^, Unit, CurrencyFormatterProps] = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
  
      if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCurrencyFormatter.mod.CurrencyFormatterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCurrencyFormatter.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCurrencyFormatter.mod.CurrencyFormatterProps])(children: _*)
  }
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

