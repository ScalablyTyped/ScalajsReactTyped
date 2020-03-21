package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringSchedulesRequest extends js.Object {
  /**
    * A filter that returns only monitoring schedules created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only monitoring schedules created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Name of a specific endpoint to fetch schedules for.
    */
  var EndpointName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A filter that returns only monitoring schedules modified after a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * Filter for monitoring schedules whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringScheduleSortKey] = js.native
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var StatusEquals: js.UndefOr[ScheduleStatus] = js.native
}

object ListMonitoringSchedulesRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: js.Date = null,
    CreationTimeBefore: js.Date = null,
    EndpointName: EndpointName = null,
    LastModifiedTimeAfter: js.Date = null,
    LastModifiedTimeBefore: js.Date = null,
    MaxResults: Int | Double = null,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: MonitoringScheduleSortKey = null,
    SortOrder: SortOrder = null,
    StatusEquals: ScheduleStatus = null
  ): ListMonitoringSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringSchedulesRequest]
  }
}

