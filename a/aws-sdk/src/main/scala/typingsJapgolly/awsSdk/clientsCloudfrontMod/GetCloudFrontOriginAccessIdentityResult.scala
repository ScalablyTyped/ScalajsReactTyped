package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFrontOriginAccessIdentityResult extends StObject {
  
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentity] = js.undefined
  
  /**
    * The current version of the origin access identity's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetCloudFrontOriginAccessIdentityResult {
  
  inline def apply(): GetCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
  }
  
  extension [Self <: GetCloudFrontOriginAccessIdentityResult](x: Self) {
    
    inline def setCloudFrontOriginAccessIdentity(value: CloudFrontOriginAccessIdentity): Self = StObject.set(x, "CloudFrontOriginAccessIdentity", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontOriginAccessIdentityUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentity", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
