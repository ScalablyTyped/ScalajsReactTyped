package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typingsJapgolly.awsSdk.sagemakerMod.AlgorithmArn = js.native
  /**
    * A brief summary about the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm being described.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * The current status of the algorithm.
    */
  var AlgorithmStatus: typingsJapgolly.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  /**
    * Details about the current status of the algorithm.
    */
  var AlgorithmStatusDetails: typingsJapgolly.awsSdk.sagemakerMod.AlgorithmStatusDetails = js.native
  /**
    * Whether the algorithm is certified to be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * A timestamp specifying when the algorithm was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * Details about inference jobs that the algorithm runs.
    */
  var InferenceSpecification: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * The product identifier of the algorithm.
    */
  var ProductId: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ProductId] = js.native
  /**
    * Details about training jobs run by this algorithm.
    */
  var TrainingSpecification: typingsJapgolly.awsSdk.sagemakerMod.TrainingSpecification = js.native
  /**
    * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}

object DescribeAlgorithmOutput {
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    AlgorithmStatusDetails: AlgorithmStatusDetails,
    CreationTime: js.Date,
    TrainingSpecification: TrainingSpecification,
    AlgorithmDescription: EntityDescription = null,
    CertifyForMarketplace: js.UndefOr[scala.Boolean] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ProductId: ProductId = null,
    ValidationSpecification: AlgorithmValidationSpecification = null
  ): DescribeAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], AlgorithmStatusDetails = AlgorithmStatusDetails.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    if (AlgorithmDescription != null) __obj.updateDynamic("AlgorithmDescription")(AlgorithmDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace.asInstanceOf[js.Any])
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmOutput]
  }
}

