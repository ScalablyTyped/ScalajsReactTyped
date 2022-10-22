package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedWifiOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): Unit
}
object GetConnectedWifiOptions {
  
  inline def apply(success: WiFi => Callback): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: WiFi) => success(t0).runNow()))
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
  
  extension [Self <: GetConnectedWifiOptions](x: Self) {
    
    inline def setSuccess(value: WiFi => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: WiFi) => value(t0).runNow()))
  }
}
