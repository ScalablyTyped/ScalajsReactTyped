package typingsJapgolly.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationRequest extends js.Object {
  /**
    * The identifier for the organization to be described.
    */
  var OrganizationId: typingsJapgolly.awsSdk.workmailMod.OrganizationId = js.native
}

object DescribeOrganizationRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): DescribeOrganizationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeOrganizationRequest]
  }
}

