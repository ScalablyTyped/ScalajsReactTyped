package typingsJapgolly.cron.mod

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "sendAt")
@js.native
object sendAt extends js.Object {
  def apply(cronTime: String): Moment = js.native
  def apply(cronTime: Moment): Moment = js.native
  def apply(cronTime: Date): Moment = js.native
}

