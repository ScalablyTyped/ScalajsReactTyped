package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 上传
/**
  * 一个可以监听上传进度变化事件，以及取消上传任务的对象
  */
trait UploadTask extends StObject {
  
  //  中断上传任务
  def abort(): Unit
  
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  
  //  取消监听上传进度变化事件
  def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
  
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
  
  //  上传进度变化事件的回调函数
  def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
}
object UploadTask {
  
  inline def apply(
    abort: Callback,
    offHeadersReceived: DataResponseCallback => Callback,
    offProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback,
    onHeadersReceived: DataResponseCallback => Callback,
    onProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, offHeadersReceived = js.Any.fromFunction1((t0: DataResponseCallback) => offHeadersReceived(t0).runNow()), offProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]) => offProgressUpdate(t0).runNow()), onHeadersReceived = js.Any.fromFunction1((t0: DataResponseCallback) => onHeadersReceived(t0).runNow()), onProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[UploadTask]
  }
  
  extension [Self <: UploadTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOffHeadersReceived(value: DataResponseCallback => Callback): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1((t0: DataResponseCallback) => value(t0).runNow()))
    
    inline def setOffProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback): Self = StObject.set(x, "offProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]) => value(t0).runNow()))
    
    inline def setOnHeadersReceived(value: DataResponseCallback => Callback): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1((t0: DataResponseCallback) => value(t0).runNow()))
    
    inline def setOnProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]) => value(t0).runNow()))
  }
}
