package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventChannel extends StObject {
  
  /** [EventChannel.emit(string eventName, any args)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.emit.html)
    *
    * 触发一个事件
    *
    * 最低基础库： `2.7.3` */
  def emit(
    /** 事件名称 */
  eventName: String,
    /** 事件参数 */
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit
  
  /** [EventChannel.off(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.off.html)
    *
    * 取消监听一个事件。给出第二个参数时，只取消给出的监听函数，否则取消所有监听函数
    *
    * 最低基础库： `2.7.3` */
  def off(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit
  
  /** [EventChannel.on(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.on.html)
    *
    * 持续监听一个事件
    *
    * 最低基础库： `2.7.3` */
  def on(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit
  
  /** [EventChannel.once(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.once.html)
    *
    * 监听一个事件一次，触发后失效
    *
    * 最低基础库： `2.7.3` */
  def once(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit
}
object EventChannel {
  
  inline def apply(
    emit: (String, Any) => Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    once: (String, EventCallback) => Callback
  ): EventChannel = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: String, t1: Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), once = js.Any.fromFunction2((t0: String, t1: EventCallback) => (once(t0, t1)).runNow()))
    __obj.asInstanceOf[EventChannel]
  }
  
  extension [Self <: EventChannel](x: Self) {
    
    inline def setEmit(value: (String, Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOff(value: (String, EventCallback) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: EventCallback) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, EventCallback) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: EventCallback) => (value(t0, t1)).runNow()))
    
    inline def setOnce(value: (String, EventCallback) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: String, t1: EventCallback) => (value(t0, t1)).runNow()))
  }
}
