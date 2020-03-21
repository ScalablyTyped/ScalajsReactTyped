package typingsJapgolly.momentTimezone.momentTimezoneMod.momentAugmentingMod

import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.momentTimezone.AnonLinks
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentTimezone extends js.Object {
  def apply(): typingsJapgolly.moment.mod.Moment = js.native
  def apply(
    date: String,
    format: MomentFormatSpecification,
    language: String,
    strict: Boolean,
    timezone: String
  ): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, language: String, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, strict: Boolean, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: String, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: js.Any, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: js.Array[Double], timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: Double, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: typingsJapgolly.moment.mod.Moment, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(date: Date, timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def apply(timezone: String): typingsJapgolly.moment.mod.Moment = js.native
  def add(packedZoneString: String): Unit = js.native
  def add(packedZoneString: js.Array[String]): Unit = js.native
  def guess(): String = js.native
  def guess(ignoreCache: Boolean): String = js.native
  def link(packedLinkString: String): Unit = js.native
  def link(packedLinkString: js.Array[String]): Unit = js.native
  def load(data: AnonLinks): Unit = js.native
  def names(): js.Array[String] = js.native
  def setDefault(): MomentTimezone = js.native
  def setDefault(timezone: String): MomentTimezone = js.native
  def zone(timezone: String): MomentZone | Null = js.native
}

