package typingsJapgolly.winrt.Windows.Globalization

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Calendar")
@js.native
class Calendar () extends ICalendar {
  def this(languages: IIterable[String]) = this()
  def this(languages: IIterable[String], calendar: String, clock: String) = this()
}

