package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobAlgorithmsConfig extends js.Object {
  /**
    * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
    */
  var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.native
  /**
    * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection     Semantic Segmentation   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/semantic-segmentation   
    */
  var LabelingJobAlgorithmSpecificationArn: typingsJapgolly.awsSdk.sagemakerMod.LabelingJobAlgorithmSpecificationArn = js.native
  /**
    * Provides configuration information for a labeling job.
    */
  var LabelingJobResourceConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.LabelingJobResourceConfig] = js.native
}

object LabelingJobAlgorithmsConfig {
  @scala.inline
  def apply(
    LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn,
    InitialActiveLearningModelArn: ModelArn = null,
    LabelingJobResourceConfig: LabelingJobResourceConfig = null
  ): LabelingJobAlgorithmsConfig = {
    val __obj = js.Dynamic.literal(LabelingJobAlgorithmSpecificationArn = LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any])
    if (InitialActiveLearningModelArn != null) __obj.updateDynamic("InitialActiveLearningModelArn")(InitialActiveLearningModelArn.asInstanceOf[js.Any])
    if (LabelingJobResourceConfig != null) __obj.updateDynamic("LabelingJobResourceConfig")(LabelingJobResourceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
  }
}

