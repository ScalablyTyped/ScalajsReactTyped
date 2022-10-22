package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicyHeadersConfig extends StObject {
  
  /**
    * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values are:    none – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this field is set to none, any headers that are listed in a CachePolicy are included in origin requests.    whitelist – The HTTP headers that are listed in the Headers type are included in requests that CloudFront sends to the origin.    allViewer – All HTTP headers in viewer requests are included in requests that CloudFront sends to the origin.    allViewerAndWhitelistCloudFront – All HTTP headers in viewer requests and the additional CloudFront headers that are listed in the Headers type are included in requests that CloudFront sends to the origin. The additional headers are added by CloudFront.  
    */
  var HeaderBehavior: OriginRequestPolicyHeaderBehavior
  
  var Headers: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.Headers] = js.undefined
}
object OriginRequestPolicyHeadersConfig {
  
  inline def apply(HeaderBehavior: OriginRequestPolicyHeaderBehavior): OriginRequestPolicyHeadersConfig = {
    val __obj = js.Dynamic.literal(HeaderBehavior = HeaderBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyHeadersConfig]
  }
  
  extension [Self <: OriginRequestPolicyHeadersConfig](x: Self) {
    
    inline def setHeaderBehavior(value: OriginRequestPolicyHeaderBehavior): Self = StObject.set(x, "HeaderBehavior", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
  }
}
