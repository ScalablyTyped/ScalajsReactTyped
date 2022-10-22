package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PerformanceObserver 对象， 用于监听性能相关事件
  *
  * 最低基础库： `2.11.0` */
trait PerformanceObserver extends StObject {
  
  /** [PerformanceObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/PerformanceObserver.disconnect.html)
    *
    * 停止监听
    *
    * 最低基础库： `2.11.0` */
  def disconnect(): Unit
  
  /** [PerformanceObserver.observe(Object options)](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/PerformanceObserver.observe.html)
    *
    * 开始监听
    *
    * 最低基础库： `2.11.0` */
  def observe(/** 设置 type 监听单个类型的指标，设置 entryTypes 监听多个类型指标。 */
  options: IAnyObject): Unit
  
  /** 获取当前支持的所有性能指标类型 */
  var supportedEntryTypes: js.Array[Any]
}
object PerformanceObserver {
  
  inline def apply(disconnect: Callback, observe: IAnyObject => Callback, supportedEntryTypes: js.Array[Any]): PerformanceObserver = {
    val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, observe = js.Any.fromFunction1((t0: IAnyObject) => observe(t0).runNow()), supportedEntryTypes = supportedEntryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceObserver]
  }
  
  extension [Self <: PerformanceObserver](x: Self) {
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setObserve(value: IAnyObject => Callback): Self = StObject.set(x, "observe", js.Any.fromFunction1((t0: IAnyObject) => value(t0).runNow()))
    
    inline def setSupportedEntryTypes(value: js.Array[Any]): Self = StObject.set(x, "supportedEntryTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedEntryTypesVarargs(value: Any*): Self = StObject.set(x, "supportedEntryTypes", js.Array(value*))
  }
}
