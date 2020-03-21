package typingsJapgolly.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterWorker extends ClusterMaster {
  var id: Double
}

object ClusterWorker {
  @scala.inline
  def apply(id: Double, pid: Double, startTime: Double, setSize: Int | Double = null): ClusterWorker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterWorker]
  }
}

