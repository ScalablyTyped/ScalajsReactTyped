package typingsJapgolly.dateFns.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "differenceInDays")
@js.native
object differenceInDays extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Double = js.native
  def apply(dateLeft: Double, dateRight: Date): Double = js.native
  def apply(dateLeft: Date, dateRight: Double): Double = js.native
  def apply(dateLeft: Date, dateRight: Date): Double = js.native
}

