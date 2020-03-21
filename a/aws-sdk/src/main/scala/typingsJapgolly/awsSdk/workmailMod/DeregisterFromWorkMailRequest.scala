package typingsJapgolly.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterFromWorkMailRequest extends js.Object {
  /**
    * The identifier for the member (user or group) to be updated.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the Amazon WorkMail entity exists.
    */
  var OrganizationId: typingsJapgolly.awsSdk.workmailMod.OrganizationId = js.native
}

object DeregisterFromWorkMailRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeregisterFromWorkMailRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterFromWorkMailRequest]
  }
}

