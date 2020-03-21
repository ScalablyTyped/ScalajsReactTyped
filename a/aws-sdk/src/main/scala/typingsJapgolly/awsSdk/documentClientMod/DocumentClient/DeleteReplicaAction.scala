package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicaAction extends js.Object {
  /**
    * The Region of the replica to be removed.
    */
  var RegionName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
}

object DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReplicaAction]
  }
}

