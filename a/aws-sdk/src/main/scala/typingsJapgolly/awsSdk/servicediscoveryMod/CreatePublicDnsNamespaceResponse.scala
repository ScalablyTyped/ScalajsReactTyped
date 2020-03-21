package typingsJapgolly.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicDnsNamespaceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.OperationId] = js.native
}

object CreatePublicDnsNamespaceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): CreatePublicDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicDnsNamespaceResponse]
  }
}

