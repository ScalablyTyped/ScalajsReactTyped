package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): Unit
}
object GetSystemInfoOptions {
  
  inline def apply(success: SystemInfo => Callback): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: SystemInfo) => success(t0).runNow()))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  extension [Self <: GetSystemInfoOptions](x: Self) {
    
    inline def setSuccess(value: SystemInfo => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: SystemInfo) => value(t0).runNow()))
  }
}
