package typingsJapgolly.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccessPointRequest extends js.Object {
  /**
    * The ID of the access point that you want to delete.
    */
  var AccessPointId: typingsJapgolly.awsSdk.efsMod.AccessPointId = js.native
}

object DeleteAccessPointRequest {
  @scala.inline
  def apply(AccessPointId: AccessPointId): DeleteAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccessPointId = AccessPointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAccessPointRequest]
  }
}

