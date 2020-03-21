package typingsJapgolly.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.TimeZone")
@js.native
class TimeZone () extends ClientObject {
  def get_description(): String = js.native
  def get_id(): Double = js.native
  def get_information(): TimeZoneInformation = js.native
  def localTimeToUTC(date: js.Date): DateTimeResult = js.native
  def utcToLocalTime(date: js.Date): DateTimeResult = js.native
}

