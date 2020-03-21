package typingsJapgolly.dateFns.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "isBefore")
@js.native
object isBefore extends js.Object {
  def apply(date: Double, dateToCompare: Double): Boolean = js.native
  def apply(date: Double, dateToCompare: Date): Boolean = js.native
  def apply(date: Date, dateToCompare: Double): Boolean = js.native
  def apply(date: Date, dateToCompare: Date): Boolean = js.native
}

