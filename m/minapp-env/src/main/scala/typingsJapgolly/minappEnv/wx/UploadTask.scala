package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadTask extends StObject {
  
  /** [UploadTask.abort()](UploadTask.abort.md)
    *
    * 中断上传任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  
  /** [UploadTask.offHeadersReceived(function callback)](UploadTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOffHeadersReceivedCallback): Unit
  
  /** [UploadTask.offProgressUpdate(function callback)](UploadTask.offProgressUpdate.md)
    *
    * 取消监听上传进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOffProgressUpdateCallback): Unit
  
  /** [UploadTask.onHeadersReceived(function callback)](UploadTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOnHeadersReceivedCallback): Unit
  
  /** [UploadTask.onProgressUpdate(function callback)](UploadTask.onProgressUpdate.md)
    *
    * 监听上传进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOnProgressUpdateCallback): Unit
}
object UploadTask {
  
  inline def apply(
    abort: Callback,
    offHeadersReceived: UploadTaskOffHeadersReceivedCallback => Callback,
    offProgressUpdate: UploadTaskOffProgressUpdateCallback => Callback,
    onHeadersReceived: UploadTaskOnHeadersReceivedCallback => Callback,
    onProgressUpdate: UploadTaskOnProgressUpdateCallback => Callback
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, offHeadersReceived = js.Any.fromFunction1((t0: UploadTaskOffHeadersReceivedCallback) => offHeadersReceived(t0).runNow()), offProgressUpdate = js.Any.fromFunction1((t0: UploadTaskOffProgressUpdateCallback) => offProgressUpdate(t0).runNow()), onHeadersReceived = js.Any.fromFunction1((t0: UploadTaskOnHeadersReceivedCallback) => onHeadersReceived(t0).runNow()), onProgressUpdate = js.Any.fromFunction1((t0: UploadTaskOnProgressUpdateCallback) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[UploadTask]
  }
  
  extension [Self <: UploadTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOffHeadersReceived(value: UploadTaskOffHeadersReceivedCallback => Callback): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1((t0: UploadTaskOffHeadersReceivedCallback) => value(t0).runNow()))
    
    inline def setOffProgressUpdate(value: UploadTaskOffProgressUpdateCallback => Callback): Self = StObject.set(x, "offProgressUpdate", js.Any.fromFunction1((t0: UploadTaskOffProgressUpdateCallback) => value(t0).runNow()))
    
    inline def setOnHeadersReceived(value: UploadTaskOnHeadersReceivedCallback => Callback): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1((t0: UploadTaskOnHeadersReceivedCallback) => value(t0).runNow()))
    
    inline def setOnProgressUpdate(value: UploadTaskOnProgressUpdateCallback => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: UploadTaskOnProgressUpdateCallback) => value(t0).runNow()))
  }
}
