package typingsJapgolly.dateFns.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "isWithinInterval")
@js.native
object isWithinInterval extends js.Object {
  def apply(date: Double, interval: Interval): Boolean = js.native
  def apply(date: Date, interval: Interval): Boolean = js.native
}

