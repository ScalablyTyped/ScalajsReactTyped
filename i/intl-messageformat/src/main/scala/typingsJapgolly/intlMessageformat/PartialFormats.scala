package typingsJapgolly.intlMessageformat

import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intl-messageformat.intl-messageformat.Formats> */
trait PartialFormats extends js.Object {
  var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
  var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.undefined
  var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
}

object PartialFormats {
  @scala.inline
  def apply(
    date: Record[String, DateTimeFormatOptions] = null,
    number: Record[String, NumberFormatOptions] = null,
    time: Record[String, DateTimeFormatOptions] = null
  ): PartialFormats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFormats]
  }
}

