package typingsJapgolly.reactIntl

import japgolly.scalajs.react.Callback
import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.reactIntl.typesMod.CustomFormats
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'messages' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
trait PickIntlConfiglocaleformaDefaultFormats extends js.Object {
  var defaultFormats: CustomFormats
  var defaultLocale: String
  var formats: CustomFormats
  var locale: String
  var messages: Record[String, js.Array[MessageFormatElement] | String]
  var onError: js.Function1[/* err */ String, Unit]
}

object PickIntlConfiglocaleformaDefaultFormats {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    locale: String,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ String => Callback
  ): PickIntlConfiglocaleformaDefaultFormats = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ java.lang.String) => onError(t0).runNow()))
    __obj.asInstanceOf[PickIntlConfiglocaleformaDefaultFormats]
  }
}

