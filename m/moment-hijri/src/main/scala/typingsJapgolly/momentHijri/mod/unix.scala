package typingsJapgolly.momentHijri.mod

import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-hijri", "unix")
@js.native
object unix extends js.Object {
  def apply(timestamp: Double): Moment = js.native
}

