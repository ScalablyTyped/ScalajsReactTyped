package typingsJapgolly.twix.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixSimpleFormatOptions extends js.Object {
  var allDay: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.undefined
}

object TwixSimpleFormatOptions {
  @scala.inline
  def apply(
    allDay: String = null,
    template: (/* left */ js.Any, /* right */ js.Any) => CallbackTo[js.Any] = null
  ): TwixSimpleFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction2((t0: /* left */ js.Any, t1: /* right */ js.Any) => template(t0, t1).runNow()))
    __obj.asInstanceOf[TwixSimpleFormatOptions]
  }
}

