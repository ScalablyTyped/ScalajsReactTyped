package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTask extends StObject {
  
  /** [RequestTask.abort()](RequestTask.abort.md)
    *
    * 中断请求任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  
  /** [RequestTask.offHeadersReceived(function callback)](RequestTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOffHeadersReceivedCallback): Unit
  
  /** [RequestTask.onHeadersReceived(function callback)](RequestTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOnHeadersReceivedCallback): Unit
}
object RequestTask {
  
  inline def apply(
    abort: Callback,
    offHeadersReceived: RequestTaskOffHeadersReceivedCallback => Callback,
    onHeadersReceived: RequestTaskOnHeadersReceivedCallback => Callback
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, offHeadersReceived = js.Any.fromFunction1((t0: RequestTaskOffHeadersReceivedCallback) => offHeadersReceived(t0).runNow()), onHeadersReceived = js.Any.fromFunction1((t0: RequestTaskOnHeadersReceivedCallback) => onHeadersReceived(t0).runNow()))
    __obj.asInstanceOf[RequestTask]
  }
  
  extension [Self <: RequestTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOffHeadersReceived(value: RequestTaskOffHeadersReceivedCallback => Callback): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1((t0: RequestTaskOffHeadersReceivedCallback) => value(t0).runNow()))
    
    inline def setOnHeadersReceived(value: RequestTaskOnHeadersReceivedCallback => Callback): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1((t0: RequestTaskOnHeadersReceivedCallback) => value(t0).runNow()))
  }
}
