package typingsJapgolly.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var DomainName: string
}
object GetDomainNameRequest {
  
  inline def apply(DomainName: string): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNameRequest]
  }
  
  extension [Self <: GetDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
