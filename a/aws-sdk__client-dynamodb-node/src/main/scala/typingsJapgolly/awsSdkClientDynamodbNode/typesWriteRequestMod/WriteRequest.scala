package typingsJapgolly.awsSdkClientDynamodbNode.typesWriteRequestMod

import typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteRequestMod.DeleteRequest
import typingsJapgolly.awsSdkClientDynamodbNode.typesPutRequestMod.PutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  var DeleteRequest: js.UndefOr[typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteRequestMod.DeleteRequest] = js.undefined
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  var PutRequest: js.UndefOr[typingsJapgolly.awsSdkClientDynamodbNode.typesPutRequestMod.PutRequest] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(DeleteRequest: DeleteRequest = null, PutRequest: PutRequest = null): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest.asInstanceOf[js.Any])
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

