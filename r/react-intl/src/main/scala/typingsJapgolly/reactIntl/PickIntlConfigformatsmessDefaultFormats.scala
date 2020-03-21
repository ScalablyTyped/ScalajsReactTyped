package typingsJapgolly.reactIntl

import japgolly.scalajs.react.Callback
import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.reactIntl.mod.CustomFormats
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
trait PickIntlConfigformatsmessDefaultFormats extends js.Object {
  var defaultFormats: CustomFormats
  var defaultLocale: String
  var formats: CustomFormats
  var messages: Record[String, js.Array[MessageFormatElement] | String]
  var onError: js.Function1[/* err */ String, Unit]
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object PickIntlConfigformatsmessDefaultFormats {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ String => Callback,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    timeZone: String = null
  ): PickIntlConfigformatsmessDefaultFormats = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ java.lang.String) => onError(t0).runNow()))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlConfigformatsmessDefaultFormats]
  }
}

