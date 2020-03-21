package typingsJapgolly.timezoneSupport.lookupConvertMod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezone-support/dist/lookup-convert", "setTimeZone")
@js.native
object setTimeZone extends js.Object {
  def apply(time: Date, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
}

