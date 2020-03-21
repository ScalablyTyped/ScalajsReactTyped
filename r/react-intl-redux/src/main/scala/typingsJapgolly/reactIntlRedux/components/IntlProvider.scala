package typingsJapgolly.reactIntlRedux.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.reactIntl.mod.CustomFormats
import typingsJapgolly.reactIntl.mod.OptionalIntlConfig
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IntlProvider {
  def apply(
    locale: String,
    defaultFormats: CustomFormats = null,
    defaultLocale: String = null,
    formats: CustomFormats = null,
    messages: Record[String, js.Array[MessageFormatElement] | String] = null,
    onError: /* err */ String => Callback = null,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    timeZone: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OptionalIntlConfig, 
    typingsJapgolly.reactIntlRedux.mod.IntlProvider, 
    Unit, 
    OptionalIntlConfig
  ] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      if (defaultFormats != null) __obj.updateDynamic("defaultFormats")(defaultFormats.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ java.lang.String) => onError(t0).runNow()))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactIntl.mod.OptionalIntlConfig, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactIntlRedux.mod.IntlProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.mod.OptionalIntlConfig])(children: _*)
  }
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  object componentImport extends js.Object
  
}

