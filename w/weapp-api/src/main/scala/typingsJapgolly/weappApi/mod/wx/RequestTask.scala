package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 网络请求任务对象
  */
trait RequestTask extends StObject {
  
  //  中断请求任务
  def abort(): Unit
  
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
}
object RequestTask {
  
  inline def apply(
    abort: Callback,
    offHeadersReceived: DataResponseCallback => Callback,
    onHeadersReceived: DataResponseCallback => Callback
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, offHeadersReceived = js.Any.fromFunction1((t0: DataResponseCallback) => offHeadersReceived(t0).runNow()), onHeadersReceived = js.Any.fromFunction1((t0: DataResponseCallback) => onHeadersReceived(t0).runNow()))
    __obj.asInstanceOf[RequestTask]
  }
  
  extension [Self <: RequestTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOffHeadersReceived(value: DataResponseCallback => Callback): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1((t0: DataResponseCallback) => value(t0).runNow()))
    
    inline def setOnHeadersReceived(value: DataResponseCallback => Callback): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1((t0: DataResponseCallback) => value(t0).runNow()))
  }
}
