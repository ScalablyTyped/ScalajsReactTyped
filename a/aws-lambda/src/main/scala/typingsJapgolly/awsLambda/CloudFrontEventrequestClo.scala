package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.cloudfrontMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & {  request  :aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest} */
trait CloudFrontEventrequestClo extends js.Object {
  var config: AnonDistributionDomainName with (AnonEventType | AnonRequestId)
  var request: CloudFrontRequest
}

object CloudFrontEventrequestClo {
  @scala.inline
  def apply(
    config: AnonDistributionDomainName with (AnonEventType | AnonRequestId),
    request: CloudFrontRequest
  ): CloudFrontEventrequestClo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontEventrequestClo]
  }
}

