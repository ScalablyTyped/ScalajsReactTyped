package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringExecutionsRequest extends js.Object {
  /**
    * A filter that returns only jobs created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only jobs created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Name of a specific endpoint to fetch jobs for.
    */
  var EndpointName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A filter that returns only jobs modified before a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only jobs modified after a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * Name of a specific schedule to fetch jobs for.
    */
  var MonitoringScheduleName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName] = js.native
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * Filter for jobs scheduled after a specified time.
    */
  var ScheduledTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filter for jobs scheduled before a specified time.
    */
  var ScheduledTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringExecutionSortKey] = js.native
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[ExecutionStatus] = js.native
}

object ListMonitoringExecutionsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: js.Date = null,
    CreationTimeBefore: js.Date = null,
    EndpointName: EndpointName = null,
    LastModifiedTimeAfter: js.Date = null,
    LastModifiedTimeBefore: js.Date = null,
    MaxResults: Int | Double = null,
    MonitoringScheduleName: MonitoringScheduleName = null,
    NextToken: NextToken = null,
    ScheduledTimeAfter: js.Date = null,
    ScheduledTimeBefore: js.Date = null,
    SortBy: MonitoringExecutionSortKey = null,
    SortOrder: SortOrder = null,
    StatusEquals: ExecutionStatus = null
  ): ListMonitoringExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MonitoringScheduleName != null) __obj.updateDynamic("MonitoringScheduleName")(MonitoringScheduleName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledTimeAfter != null) __obj.updateDynamic("ScheduledTimeAfter")(ScheduledTimeAfter.asInstanceOf[js.Any])
    if (ScheduledTimeBefore != null) __obj.updateDynamic("ScheduledTimeBefore")(ScheduledTimeBefore.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringExecutionsRequest]
  }
}

