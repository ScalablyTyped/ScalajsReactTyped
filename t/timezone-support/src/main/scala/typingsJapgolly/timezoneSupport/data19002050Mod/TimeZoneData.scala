package typingsJapgolly.timezoneSupport.data19002050Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneData extends js.Object {
  var links: js.Array[String]
  var zones: PackedTimeZones
}

object TimeZoneData {
  @scala.inline
  def apply(links: js.Array[String], zones: PackedTimeZones): TimeZoneData = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeZoneData]
  }
}

