package typingsJapgolly.dateFns.esmMod

import typingsJapgolly.dateFns.AnonWeekStartsOn
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "isThisWeek")
@js.native
object isThisWeek extends js.Object {
  def apply(date: Double): Boolean = js.native
  def apply(date: Double, options: AnonWeekStartsOn): Boolean = js.native
  def apply(date: Date): Boolean = js.native
  def apply(date: Date, options: AnonWeekStartsOn): Boolean = js.native
}

