package typingsJapgolly.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to delete.
    */
  var AwsRegion: typingsJapgolly.awsSdk.servicequotasMod.AwsRegion = js.native
  /**
    * Specifies the code for the quota that you want to delete.
    */
  var QuotaCode: typingsJapgolly.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the code for the service that you want to delete.
    */
  var ServiceCode: typingsJapgolly.awsSdk.servicequotasMod.ServiceCode = js.native
}

object DeleteServiceQuotaIncreaseRequestFromTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): DeleteServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateRequest]
  }
}

