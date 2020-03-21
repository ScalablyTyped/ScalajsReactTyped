package typingsJapgolly.momentTimezone.momentTimezoneMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def tz(): js.UndefOr[String] = js.native
  def tz(timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def tz(timezone: String, keepLocalTime: Boolean): typingsJapgolly.moment.mod.Moment = js.native
  def zoneAbbr(): String = js.native
  def zoneName(): String = js.native
}

