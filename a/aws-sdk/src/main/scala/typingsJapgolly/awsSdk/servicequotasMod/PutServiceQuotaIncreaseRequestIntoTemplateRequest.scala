package typingsJapgolly.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota. 
    */
  var AwsRegion: typingsJapgolly.awsSdk.servicequotasMod.AwsRegion = js.native
  /**
    * Specifies the new, increased value for the quota. 
    */
  var DesiredValue: QuotaValue = js.native
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: typingsJapgolly.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typingsJapgolly.awsSdk.servicequotasMod.ServiceCode = js.native
}

object PutServiceQuotaIncreaseRequestIntoTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): PutServiceQuotaIncreaseRequestIntoTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateRequest]
  }
}

