package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  var MaximumPartitionCount: typingsJapgolly.awsSdk.cloudsearchMod.MaximumPartitionCount = js.native
  var MaximumReplicationCount: typingsJapgolly.awsSdk.cloudsearchMod.MaximumReplicationCount = js.native
}

object Limits {
  @scala.inline
  def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount.asInstanceOf[js.Any], MaximumReplicationCount = MaximumReplicationCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Limits]
  }
}

