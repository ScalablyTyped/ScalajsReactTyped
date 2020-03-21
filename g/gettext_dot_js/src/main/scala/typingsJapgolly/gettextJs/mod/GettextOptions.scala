package typingsJapgolly.gettextJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GettextOptions extends js.Object {
  var ctxt_delimiter: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var plural_func: js.UndefOr[PluralForm] = js.undefined
}

object GettextOptions {
  @scala.inline
  def apply(
    ctxt_delimiter: String = null,
    domain: String = null,
    locale: String = null,
    plural_func: /* n */ Double => CallbackTo[Double] = null
  ): GettextOptions = {
    val __obj = js.Dynamic.literal()
    if (ctxt_delimiter != null) __obj.updateDynamic("ctxt_delimiter")(ctxt_delimiter.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (plural_func != null) __obj.updateDynamic("plural_func")(js.Any.fromFunction1((t0: /* n */ scala.Double) => plural_func(t0).runNow()))
    __obj.asInstanceOf[GettextOptions]
  }
}

