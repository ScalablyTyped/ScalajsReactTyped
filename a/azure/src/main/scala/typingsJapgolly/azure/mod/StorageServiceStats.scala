package typingsJapgolly.azure.mod

import typingsJapgolly.azure.AnonLastSyncTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceStats extends js.Object {
  var GeoReplication: AnonLastSyncTime
}

object StorageServiceStats {
  @scala.inline
  def apply(GeoReplication: AnonLastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageServiceStats]
  }
}

