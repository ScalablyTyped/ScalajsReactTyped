package typingsJapgolly.pulumiAws.getServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaArgs extends js.Object {
  /**
    * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[String] = js.native
  /**
    * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaName: js.UndefOr[String] = js.native
  /**
    * Service code for the quota. Available values can be found with the [`aws.servicequotas.getService` data source](https://www.terraform.io/docs/providers/aws/d/servicequotas_service.html) or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: String = js.native
}

object GetServiceQuotaArgs {
  @scala.inline
  def apply(serviceCode: String, quotaCode: String = null, quotaName: String = null): GetServiceQuotaArgs = {
    val __obj = js.Dynamic.literal(serviceCode = serviceCode.asInstanceOf[js.Any])
    if (quotaCode != null) __obj.updateDynamic("quotaCode")(quotaCode.asInstanceOf[js.Any])
    if (quotaName != null) __obj.updateDynamic("quotaName")(quotaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaArgs]
  }
}

