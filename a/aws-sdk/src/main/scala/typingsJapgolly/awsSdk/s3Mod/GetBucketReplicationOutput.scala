package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketReplicationOutput extends js.Object {
  var ReplicationConfiguration: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.ReplicationConfiguration] = js.native
}

object GetBucketReplicationOutput {
  @scala.inline
  def apply(ReplicationConfiguration: ReplicationConfiguration = null): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal()
    if (ReplicationConfiguration != null) __obj.updateDynamic("ReplicationConfiguration")(ReplicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
}

