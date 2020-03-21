package typingsJapgolly.reactDynamicNumber.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.reactDynamicNumber.mod.DynamicNumberProps
import typingsJapgolly.reactDynamicNumber.mod.default
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Space
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDynamicNumber {
  def apply(
    fraction: Int | Double = null,
    integer: Int | Double = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ReactEventFrom[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Callback = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    separator: Dot | Comma = null,
    thousand: Boolean | Space = null,
    value: Double | _empty = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DynamicNumberProps, default, Unit, DynamicNumberProps] = {
    val __obj = js.Dynamic.literal()
  
      if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement], t1: /* modelValue */ scala.Double, t2: /* viewValue */ java.lang.String) => onChange(t0, t1, t2).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDynamicNumber.mod.DynamicNumberProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDynamicNumber.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDynamicNumber.mod.DynamicNumberProps])(children: _*)
  }
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

