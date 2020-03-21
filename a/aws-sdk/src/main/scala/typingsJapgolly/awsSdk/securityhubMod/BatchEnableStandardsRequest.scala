package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsRequest extends js.Object {
  /**
    * The list of standards compliance checks to enable.
    */
  var StandardsSubscriptionRequests: typingsJapgolly.awsSdk.securityhubMod.StandardsSubscriptionRequests = js.native
}

object BatchEnableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
}

