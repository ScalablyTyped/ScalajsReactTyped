package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationGroupMemberAction extends js.Object {
  /**
    * The Region where the replica exists.
    */
  var RegionName: typingsJapgolly.awsSdk.dynamodbMod.RegionName = js.native
}

object DeleteReplicationGroupMemberAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
  }
}

