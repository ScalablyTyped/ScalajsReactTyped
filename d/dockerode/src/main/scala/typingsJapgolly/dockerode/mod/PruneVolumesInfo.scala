package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneVolumesInfo extends js.Object {
  var SpaceReclaimed: Double
  var VolumesDeleted: js.Array[String]
}

object PruneVolumesInfo {
  @scala.inline
  def apply(SpaceReclaimed: Double, VolumesDeleted: js.Array[String]): PruneVolumesInfo = {
    val __obj = js.Dynamic.literal(SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any], VolumesDeleted = VolumesDeleted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PruneVolumesInfo]
  }
}

