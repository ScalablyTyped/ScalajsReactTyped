package typingsJapgolly.exceljs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
trait PartialCsvReadOptions extends js.Object {
  var dateFormats: js.UndefOr[js.Array[String]] = js.undefined
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.undefined
}

object PartialCsvReadOptions {
  @scala.inline
  def apply(
    dateFormats: js.Array[String] = null,
    map: (/* value */ js.Any, /* index */ Double) => CallbackTo[js.Any] = null
  ): PartialCsvReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* index */ scala.Double) => map(t0, t1).runNow()))
    __obj.asInstanceOf[PartialCsvReadOptions]
  }
}

