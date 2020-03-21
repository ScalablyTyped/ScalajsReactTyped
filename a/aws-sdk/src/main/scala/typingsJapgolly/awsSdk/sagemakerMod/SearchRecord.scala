package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRecord extends js.Object {
  /**
    * A summary of the properties of an experiment.
    */
  var Experiment: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.Experiment] = js.native
  /**
    * A TrainingJob object that is returned as part of a Search request.
    */
  var TrainingJob: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrainingJob] = js.native
  /**
    * A summary of the properties of a trial.
    */
  var Trial: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.Trial] = js.native
  /**
    * A summary of the properties of a trial component.
    */
  var TrialComponent: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrialComponent] = js.native
}

object SearchRecord {
  @scala.inline
  def apply(
    Experiment: Experiment = null,
    TrainingJob: TrainingJob = null,
    Trial: Trial = null,
    TrialComponent: TrialComponent = null
  ): SearchRecord = {
    val __obj = js.Dynamic.literal()
    if (Experiment != null) __obj.updateDynamic("Experiment")(Experiment.asInstanceOf[js.Any])
    if (TrainingJob != null) __obj.updateDynamic("TrainingJob")(TrainingJob.asInstanceOf[js.Any])
    if (Trial != null) __obj.updateDynamic("Trial")(Trial.asInstanceOf[js.Any])
    if (TrialComponent != null) __obj.updateDynamic("TrialComponent")(TrialComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRecord]
  }
}

