package typingsJapgolly.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRequestedServiceQuotaChangeHistoryRequest extends js.Object {
  /**
    * (Optional) Limits the number of results that you want to include in the response. If you don't include this parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond the specified maximum, the NextToken element is present and has a value (isn't null). Include that value as the NextToken request parameter in the call to the operation to get the next part of the results. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.servicequotasMod.MaxResults] = js.native
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typingsJapgolly.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * Specifies the status value of the quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.native
}

object ListRequestedServiceQuotaChangeHistoryRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ServiceCode: ServiceCode = null,
    Status: RequestStatus = null
  ): ListRequestedServiceQuotaChangeHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryRequest]
  }
}

