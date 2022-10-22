package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.commonCloudfrontMod.CloudFrontRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & {  request :aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest} */
trait CloudFrontEventrequestClo extends StObject {
  
  var config: DistributionDomainName
  
  var request: CloudFrontRequest
}
object CloudFrontEventrequestClo {
  
  inline def apply(config: DistributionDomainName, request: CloudFrontRequest): CloudFrontEventrequestClo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventrequestClo]
  }
  
  extension [Self <: CloudFrontEventrequestClo](x: Self) {
    
    inline def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: CloudFrontRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
