package typingsJapgolly.pulumiAws.serviceQuotaMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotaState extends js.Object {
  /**
    * Whether the service quota can be increased.
    */
  val adjustable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: js.UndefOr[Input[Double]] = js.native
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the quota.
    */
  val quotaName: js.UndefOr[Input[String]] = js.native
  val requestId: js.UndefOr[Input[String]] = js.native
  val requestStatus: js.UndefOr[Input[String]] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the service.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: js.UndefOr[Input[Double]] = js.native
}

object ServiceQuotaState {
  @scala.inline
  def apply(
    adjustable: Input[Boolean] = null,
    arn: Input[String] = null,
    defaultValue: Input[Double] = null,
    quotaCode: Input[String] = null,
    quotaName: Input[String] = null,
    requestId: Input[String] = null,
    requestStatus: Input[String] = null,
    serviceCode: Input[String] = null,
    serviceName: Input[String] = null,
    value: Input[Double] = null
  ): ServiceQuotaState = {
    val __obj = js.Dynamic.literal()
    if (adjustable != null) __obj.updateDynamic("adjustable")(adjustable.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (quotaCode != null) __obj.updateDynamic("quotaCode")(quotaCode.asInstanceOf[js.Any])
    if (quotaName != null) __obj.updateDynamic("quotaName")(quotaName.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (requestStatus != null) __obj.updateDynamic("requestStatus")(requestStatus.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceQuotaState]
  }
}

