package typingsJapgolly.reactIntl

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'onError'> */
trait PickIntlConfiglocaleonErr extends js.Object {
  var locale: String
  var onError: js.Function1[/* err */ String, Unit]
}

object PickIntlConfiglocaleonErr {
  @scala.inline
  def apply(locale: String, onError: /* err */ String => Callback): PickIntlConfiglocaleonErr = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ java.lang.String) => onError(t0).runNow()))
    __obj.asInstanceOf[PickIntlConfiglocaleonErr]
  }
}

