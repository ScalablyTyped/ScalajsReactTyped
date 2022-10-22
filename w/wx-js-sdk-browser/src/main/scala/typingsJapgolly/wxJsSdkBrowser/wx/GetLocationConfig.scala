package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MGetLocationConfig(res: Location): Unit
  
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetLocationConfig {
  
  inline def apply(success: Location => Callback): GetLocationConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Location) => success(t0).runNow()))
    __obj.asInstanceOf[GetLocationConfig]
  }
  
  extension [Self <: GetLocationConfig](x: Self) {
    
    inline def setSuccess(value: Location => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Location) => value(t0).runNow()))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
