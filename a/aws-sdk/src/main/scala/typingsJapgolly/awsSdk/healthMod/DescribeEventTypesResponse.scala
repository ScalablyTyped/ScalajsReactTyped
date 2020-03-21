package typingsJapgolly.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTypesResponse extends js.Object {
  /**
    * A list of event types that match the filter criteria. Event types have a category (issue, accountNotification, or scheduledChange), a service (for example, EC2, RDS, DATAPIPELINE, BILLING), and a code (in the format AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT).
    */
  var eventTypes: js.UndefOr[EventTypeList_] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsJapgolly.awsSdk.healthMod.nextToken] = js.native
}

object DescribeEventTypesResponse {
  @scala.inline
  def apply(eventTypes: EventTypeList_ = null, nextToken: nextToken = null): DescribeEventTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTypesResponse]
  }
}

