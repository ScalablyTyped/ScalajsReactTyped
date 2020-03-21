package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointOutput extends js.Object {
  /**
    * A timestamp that shows when the endpoint was created.
    */
  var CreationTime: js.Date = js.native
  var DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typingsJapgolly.awsSdk.sagemakerMod.EndpointArn = js.native
  /**
    * The name of the endpoint configuration associated with this endpoint.
    */
  var EndpointConfigName: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * Name of the endpoint.
    */
  var EndpointName: typingsJapgolly.awsSdk.sagemakerMod.EndpointName = js.native
  /**
    * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This maintenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use DescribeEndpointOutput$FailureReason for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.  
    */
  var EndpointStatus: typingsJapgolly.awsSdk.sagemakerMod.EndpointStatus = js.native
  /**
    * If the status of the endpoint is Failed, the reason why it failed. 
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that shows when the endpoint was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    *  An array of ProductionVariantSummary objects, one for each model hosted behind this endpoint. 
    */
  var ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.native
}

object DescribeEndpointOutput {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointArn: EndpointArn,
    EndpointConfigName: EndpointConfigName,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: js.Date,
    DataCaptureConfig: DataCaptureConfigSummary = null,
    FailureReason: FailureReason = null,
    ProductionVariants: ProductionVariantSummaryList = null
  ): DescribeEndpointOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    if (DataCaptureConfig != null) __obj.updateDynamic("DataCaptureConfig")(DataCaptureConfig.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (ProductionVariants != null) __obj.updateDynamic("ProductionVariants")(ProductionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointOutput]
  }
}

