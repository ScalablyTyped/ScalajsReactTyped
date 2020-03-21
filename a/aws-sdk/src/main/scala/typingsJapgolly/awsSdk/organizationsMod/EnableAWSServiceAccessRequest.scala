package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableAWSServiceAccessRequest extends js.Object {
  /**
    * The service principal name of the AWS service for which you want to enable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typingsJapgolly.awsSdk.organizationsMod.ServicePrincipal = js.native
}

object EnableAWSServiceAccessRequest {
  @scala.inline
  def apply(ServicePrincipal: ServicePrincipal): EnableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableAWSServiceAccessRequest]
  }
}

