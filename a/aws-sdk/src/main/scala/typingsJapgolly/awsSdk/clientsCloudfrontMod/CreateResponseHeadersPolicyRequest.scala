package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResponseHeadersPolicyRequest extends StObject {
  
  /**
    * Contains metadata about the response headers policy, and a set of configurations that specify the response headers.
    */
  var ResponseHeadersPolicyConfig: typingsJapgolly.awsSdk.clientsCloudfrontMod.ResponseHeadersPolicyConfig
}
object CreateResponseHeadersPolicyRequest {
  
  inline def apply(ResponseHeadersPolicyConfig: ResponseHeadersPolicyConfig): CreateResponseHeadersPolicyRequest = {
    val __obj = js.Dynamic.literal(ResponseHeadersPolicyConfig = ResponseHeadersPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResponseHeadersPolicyRequest]
  }
  
  extension [Self <: CreateResponseHeadersPolicyRequest](x: Self) {
    
    inline def setResponseHeadersPolicyConfig(value: ResponseHeadersPolicyConfig): Self = StObject.set(x, "ResponseHeadersPolicyConfig", value.asInstanceOf[js.Any])
  }
}
