package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryObserver extends StObject {
  
  /** [MediaQueryObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.disconnect.html)
    *
    * 停止监听。回调函数将不再触发 */
  def disconnect(): Unit
  
  /** [MediaQueryObserver.observe(Object descriptor, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.observe.html)
    *
    * 开始监听页面 media query 变化情况 */
  def observe(
    /** media query 描述符 */
  descriptor: ObserveDescriptor,
    /** 监听 media query 状态变化的回调函数 */
  callback: MediaQueryObserverObserveCallback
  ): Unit
}
object MediaQueryObserver {
  
  inline def apply(disconnect: Callback, observe: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Callback): MediaQueryObserver = {
    val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, observe = js.Any.fromFunction2((t0: ObserveDescriptor, t1: MediaQueryObserverObserveCallback) => (observe(t0, t1)).runNow()))
    __obj.asInstanceOf[MediaQueryObserver]
  }
  
  extension [Self <: MediaQueryObserver](x: Self) {
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setObserve(value: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Callback): Self = StObject.set(x, "observe", js.Any.fromFunction2((t0: ObserveDescriptor, t1: MediaQueryObserverObserveCallback) => (value(t0, t1)).runNow()))
  }
}
