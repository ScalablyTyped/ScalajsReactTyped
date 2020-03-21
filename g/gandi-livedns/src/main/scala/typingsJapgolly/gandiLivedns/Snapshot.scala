package typingsJapgolly.gandiLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * Can be used as a date with "new Date(change_time);"
    */
  var change_time: String
  var serial: Double
  var zone_data: js.Array[ZoneRecord]
  var zone_uuid: String
}

object Snapshot {
  @scala.inline
  def apply(change_time: String, serial: Double, zone_data: js.Array[ZoneRecord], zone_uuid: String): Snapshot = {
    val __obj = js.Dynamic.literal(change_time = change_time.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], zone_data = zone_data.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Snapshot]
  }
}

