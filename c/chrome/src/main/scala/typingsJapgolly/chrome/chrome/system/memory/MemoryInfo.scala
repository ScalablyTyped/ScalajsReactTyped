package typingsJapgolly.chrome.chrome.system.memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: Double
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: Double
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: Double, capacity: Double): MemoryInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryInfo]
  }
}

