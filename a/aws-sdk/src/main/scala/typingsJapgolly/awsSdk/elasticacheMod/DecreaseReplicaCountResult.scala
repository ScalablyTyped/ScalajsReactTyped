package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicaCountResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}

object DecreaseReplicaCountResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): DecreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicaCountResult]
  }
}

