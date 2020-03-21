package typingsJapgolly.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPlan extends js.Object {
  /**
    * The application source.
    */
  var ApplicationSource: typingsJapgolly.awsSdk.autoscalingplansMod.ApplicationSource = js.native
  /**
    * The Unix time stamp when the scaling plan was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typingsJapgolly.awsSdk.autoscalingplansMod.ScalingInstructions = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
  /**
    * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
    */
  var StatusCode: ScalingPlanStatusCode = js.native
  /**
    * A simple message about the current status of the scaling plan.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.native
  /**
    * The Unix time stamp when the scaling plan entered the current status.
    */
  var StatusStartTime: js.UndefOr[js.Date] = js.native
}

object ScalingPlan {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    StatusCode: ScalingPlanStatusCode,
    CreationTime: js.Date = null,
    StatusMessage: XmlString = null,
    StatusStartTime: js.Date = null
  ): ScalingPlan = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (StatusStartTime != null) __obj.updateDynamic("StatusStartTime")(StatusStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlan]
  }
}

