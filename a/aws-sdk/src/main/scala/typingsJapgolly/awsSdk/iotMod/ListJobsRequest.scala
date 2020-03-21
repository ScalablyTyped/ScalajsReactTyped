package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    status: JobStatus = null,
    targetSelection: TargetSelection = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

