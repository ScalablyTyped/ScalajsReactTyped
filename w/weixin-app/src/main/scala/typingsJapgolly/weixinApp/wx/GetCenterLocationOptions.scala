package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----地图组件控制
trait GetCenterLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Latitude): Unit
}
object GetCenterLocationOptions {
  
  inline def apply(success: Latitude => Callback): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Latitude) => success(t0).runNow()))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  extension [Self <: GetCenterLocationOptions](x: Self) {
    
    inline def setSuccess(value: Latitude => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Latitude) => value(t0).runNow()))
  }
}
