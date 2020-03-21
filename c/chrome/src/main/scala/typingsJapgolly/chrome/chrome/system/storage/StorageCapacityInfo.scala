package typingsJapgolly.chrome.chrome.system.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageCapacityInfo extends js.Object {
  /** The available capacity of the storage device, in bytes. */
  var availableCapacity: Double
  /** A copied |id| of getAvailableCapacity function parameter |id|. */
  var id: String
}

object StorageCapacityInfo {
  @scala.inline
  def apply(availableCapacity: Double, id: String): StorageCapacityInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageCapacityInfo]
  }
}

