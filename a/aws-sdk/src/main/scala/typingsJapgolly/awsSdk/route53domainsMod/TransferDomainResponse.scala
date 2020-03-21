package typingsJapgolly.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferDomainResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: typingsJapgolly.awsSdk.route53domainsMod.OperationId = js.native
}

object TransferDomainResponse {
  @scala.inline
  def apply(OperationId: OperationId): TransferDomainResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferDomainResponse]
  }
}

