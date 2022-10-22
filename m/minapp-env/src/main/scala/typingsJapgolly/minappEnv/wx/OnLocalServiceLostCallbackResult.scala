package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLocalServiceLostCallbackResult extends StObject {
  
  /** 服务的名称 */
  var serviceName: String
  
  /** 服务的类型 */
  var serviceType: String
}
object OnLocalServiceLostCallbackResult {
  
  inline def apply(serviceName: String, serviceType: String): OnLocalServiceLostCallbackResult = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceLostCallbackResult]
  }
  
  extension [Self <: OnLocalServiceLostCallbackResult](x: Self) {
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
