package typingsJapgolly.cron.mod

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "timeout")
@js.native
object timeout extends js.Object {
  def apply(cronTime: String): Double = js.native
  def apply(cronTime: Moment): Double = js.native
  def apply(cronTime: Date): Double = js.native
}

