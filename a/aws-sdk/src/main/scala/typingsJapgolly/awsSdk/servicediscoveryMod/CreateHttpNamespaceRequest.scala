package typingsJapgolly.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHttpNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateHttpNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The name that you want to assign to this namespace.
    */
  var Name: NamespaceName = js.native
}

object CreateHttpNamespaceRequest {
  @scala.inline
  def apply(Name: NamespaceName, CreatorRequestId: ResourceId = null, Description: ResourceDescription = null): CreateHttpNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHttpNamespaceRequest]
  }
}

