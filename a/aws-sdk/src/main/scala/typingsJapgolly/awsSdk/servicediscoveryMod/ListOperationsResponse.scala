package typingsJapgolly.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsResponse extends js.Object {
  /**
    * If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.NextToken] = js.native
  /**
    * Summary information about the operations that match the specified criteria.
    */
  var Operations: js.UndefOr[OperationSummaryList] = js.native
}

object ListOperationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Operations: OperationSummaryList = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Operations != null) __obj.updateDynamic("Operations")(Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

