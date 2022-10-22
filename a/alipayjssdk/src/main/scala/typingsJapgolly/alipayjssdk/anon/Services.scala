package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 蓝牙设备主 service 的 uuid 列表，如果services 为空，则返回所有的已经连接的设备 */
  var services: js.Array[String]
}
object Services {
  
  inline def apply(services: js.Array[String]): Services = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  extension [Self <: Services](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
