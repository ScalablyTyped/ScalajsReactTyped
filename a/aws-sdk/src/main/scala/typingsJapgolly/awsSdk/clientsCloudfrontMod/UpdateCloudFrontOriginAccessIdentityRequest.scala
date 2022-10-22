package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCloudFrontOriginAccessIdentityRequest extends StObject {
  
  /**
    * The identity's configuration information.
    */
  var CloudFrontOriginAccessIdentityConfig: typingsJapgolly.awsSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityConfig
  
  /**
    * The identity's id.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object UpdateCloudFrontOriginAccessIdentityRequest {
  
  inline def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig, Id: String): UpdateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
  }
  
  extension [Self <: UpdateCloudFrontOriginAccessIdentityRequest](x: Self) {
    
    inline def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
