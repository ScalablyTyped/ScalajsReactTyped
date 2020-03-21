package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointConfigOutput extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date = js.native
  var DataCaptureConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.DataCaptureConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * Name of the Amazon SageMaker endpoint configuration.
    */
  var EndpointConfigName: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList = js.native
}

object DescribeEndpointConfigOutput {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList,
    DataCaptureConfig: DataCaptureConfig = null,
    KmsKeyId: KmsKeyId = null
  ): DescribeEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], ProductionVariants = ProductionVariants.asInstanceOf[js.Any])
    if (DataCaptureConfig != null) __obj.updateDynamic("DataCaptureConfig")(DataCaptureConfig.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointConfigOutput]
  }
}

