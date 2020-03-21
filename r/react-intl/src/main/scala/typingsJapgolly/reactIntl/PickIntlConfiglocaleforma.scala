package typingsJapgolly.reactIntl

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactIntl.typesMod.CustomFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'onError' | 'timeZone'> */
trait PickIntlConfiglocaleforma extends js.Object {
  var formats: CustomFormats
  var locale: String
  var onError: js.Function1[/* err */ String, Unit]
  var timeZone: js.UndefOr[String] = js.undefined
}

object PickIntlConfiglocaleforma {
  @scala.inline
  def apply(
    formats: CustomFormats,
    locale: String,
    onError: /* err */ String => Callback,
    timeZone: String = null
  ): PickIntlConfiglocaleforma = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ java.lang.String) => onError(t0).runNow()))
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlConfiglocaleforma]
  }
}

