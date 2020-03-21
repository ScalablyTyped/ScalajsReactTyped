package typingsJapgolly.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlansRequest extends js.Object {
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.ApplicationSources] = js.native
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanNames] = js.native
  /**
    * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
    */
  var ScalingPlanVersion: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanVersion] = js.native
}

object DescribeScalingPlansRequest {
  @scala.inline
  def apply(
    ApplicationSources: ApplicationSources = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ScalingPlanNames: ScalingPlanNames = null,
    ScalingPlanVersion: Int | Double = null
  ): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    if (ApplicationSources != null) __obj.updateDynamic("ApplicationSources")(ApplicationSources.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingPlanNames != null) __obj.updateDynamic("ScalingPlanNames")(ScalingPlanNames.asInstanceOf[js.Any])
    if (ScalingPlanVersion != null) __obj.updateDynamic("ScalingPlanVersion")(ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
}

