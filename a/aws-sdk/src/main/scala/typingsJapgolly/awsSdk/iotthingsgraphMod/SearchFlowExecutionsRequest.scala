package typingsJapgolly.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFlowExecutionsRequest extends js.Object {
  /**
    * The date and time of the latest flow execution to return.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of a flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The date and time of the earliest flow execution to return.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: Urn = js.native
}

object SearchFlowExecutionsRequest {
  @scala.inline
  def apply(
    systemInstanceId: Urn,
    endTime: js.Date = null,
    flowExecutionId: FlowExecutionId = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    startTime: js.Date = null
  ): SearchFlowExecutionsRequest = {
    val __obj = js.Dynamic.literal(systemInstanceId = systemInstanceId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (flowExecutionId != null) __obj.updateDynamic("flowExecutionId")(flowExecutionId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFlowExecutionsRequest]
  }
}

