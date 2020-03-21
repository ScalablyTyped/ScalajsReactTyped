package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReplicationTaskAssessmentResponse extends js.Object {
  /**
    *  The assessed replication task. 
    */
  var ReplicationTask: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.ReplicationTask] = js.native
}

object StartReplicationTaskAssessmentResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StartReplicationTaskAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskAssessmentResponse]
  }
}

