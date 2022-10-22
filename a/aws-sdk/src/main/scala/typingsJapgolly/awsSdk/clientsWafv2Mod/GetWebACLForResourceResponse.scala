package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLForResourceResponse extends StObject {
  
  /**
    * The web ACL that is associated with the resource. If there is no associated resource, WAF returns a null web ACL.
    */
  var WebACL: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.WebACL] = js.undefined
}
object GetWebACLForResourceResponse {
  
  inline def apply(): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
  
  extension [Self <: GetWebACLForResourceResponse](x: Self) {
    
    inline def setWebACL(value: WebACL): Self = StObject.set(x, "WebACL", value.asInstanceOf[js.Any])
    
    inline def setWebACLUndefined: Self = StObject.set(x, "WebACL", js.undefined)
  }
}
