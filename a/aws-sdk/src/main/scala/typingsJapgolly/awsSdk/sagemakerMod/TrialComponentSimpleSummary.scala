package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSimpleSummary extends js.Object {
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentArn] = js.native
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
  var TrialComponentSource: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentSource] = js.native
}

object TrialComponentSimpleSummary {
  @scala.inline
  def apply(
    CreatedBy: UserContext = null,
    CreationTime: js.Date = null,
    TrialComponentArn: TrialComponentArn = null,
    TrialComponentName: ExperimentEntityName = null,
    TrialComponentSource: TrialComponentSource = null
  ): TrialComponentSimpleSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    if (TrialComponentName != null) __obj.updateDynamic("TrialComponentName")(TrialComponentName.asInstanceOf[js.Any])
    if (TrialComponentSource != null) __obj.updateDynamic("TrialComponentSource")(TrialComponentSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSimpleSummary]
  }
}

