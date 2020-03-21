package typingsJapgolly.pulumiAws.inputMod.elasticache

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupClusterMode extends js.Object {
  /**
    * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
    */
  var numNodeGroups: Input[Double] = js.native
  /**
    * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
    */
  var replicasPerNodeGroup: Input[Double] = js.native
}

object ReplicationGroupClusterMode {
  @scala.inline
  def apply(numNodeGroups: Input[Double], replicasPerNodeGroup: Input[Double]): ReplicationGroupClusterMode = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicationGroupClusterMode]
  }
}

