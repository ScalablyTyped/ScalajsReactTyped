package typingsJapgolly.intlMessageformat.mod

import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var date: Record[String, DateTimeFormatOptions]
  var number: Record[String, NumberFormatOptions]
  var time: Record[String, DateTimeFormatOptions]
}

object Formats {
  @scala.inline
  def apply(
    date: Record[String, DateTimeFormatOptions],
    number: Record[String, NumberFormatOptions],
    time: Record[String, DateTimeFormatOptions]
  ): Formats = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Formats]
  }
}

