package typingsJapgolly.bootstrapDatepicker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerCustomFormatOptions extends js.Object {
  var toDisplay: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, String]
  ] = js.undefined
  var toValue: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, js.Date]
  ] = js.undefined
}

object DatepickerCustomFormatOptions {
  @scala.inline
  def apply(
    toDisplay: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => CallbackTo[String] = null,
    toValue: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => CallbackTo[js.Date] = null
  ): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (toDisplay != null) __obj.updateDynamic("toDisplay")(js.Any.fromFunction3((t0: /* date */ java.lang.String, t1: /* format */ js.Any, t2: /* language */ js.Any) => toDisplay(t0, t1, t2).runNow()))
    if (toValue != null) __obj.updateDynamic("toValue")(js.Any.fromFunction3((t0: /* date */ java.lang.String, t1: /* format */ js.Any, t2: /* language */ js.Any) => toValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
}

