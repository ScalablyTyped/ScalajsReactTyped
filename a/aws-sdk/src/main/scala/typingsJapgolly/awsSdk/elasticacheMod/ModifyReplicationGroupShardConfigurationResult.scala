package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}

object ModifyReplicationGroupShardConfigurationResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
}

