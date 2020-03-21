package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobObjective] = js.native
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ParameterRanges] = js.native
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: typingsJapgolly.awsSdk.sagemakerMod.ResourceLimits = js.native
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. To use the Bayesian search strategy, set this to Bayesian. To randomly search, set it to Random. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrainingJobEarlyStoppingType] = js.native
  /**
    * The tuning job's completion criteria.
    */
  var TuningJobCompletionCriteria: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TuningJobCompletionCriteria] = js.native
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(
    ResourceLimits: ResourceLimits,
    Strategy: HyperParameterTuningJobStrategyType,
    HyperParameterTuningJobObjective: HyperParameterTuningJobObjective = null,
    ParameterRanges: ParameterRanges = null,
    TrainingJobEarlyStoppingType: TrainingJobEarlyStoppingType = null,
    TuningJobCompletionCriteria: TuningJobCompletionCriteria = null
  ): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(ResourceLimits = ResourceLimits.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    if (HyperParameterTuningJobObjective != null) __obj.updateDynamic("HyperParameterTuningJobObjective")(HyperParameterTuningJobObjective.asInstanceOf[js.Any])
    if (ParameterRanges != null) __obj.updateDynamic("ParameterRanges")(ParameterRanges.asInstanceOf[js.Any])
    if (TrainingJobEarlyStoppingType != null) __obj.updateDynamic("TrainingJobEarlyStoppingType")(TrainingJobEarlyStoppingType.asInstanceOf[js.Any])
    if (TuningJobCompletionCriteria != null) __obj.updateDynamic("TuningJobCompletionCriteria")(TuningJobCompletionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
}

