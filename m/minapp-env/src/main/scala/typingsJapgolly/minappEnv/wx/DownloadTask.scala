package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadTask extends StObject {
  
  /** [DownloadTask.abort()](DownloadTask.abort.md)
    *
    * 中断下载任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  
  /** [DownloadTask.offHeadersReceived(function callback)](DownloadTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: DownloadTaskOffHeadersReceivedCallback): Unit
  
  /** [DownloadTask.offProgressUpdate(function callback)](DownloadTask.offProgressUpdate.md)
    *
    * 取消监听下载进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOffProgressUpdateCallback): Unit
  
  /** [DownloadTask.onHeadersReceived(function callback)](DownloadTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: DownloadTaskOnHeadersReceivedCallback): Unit
  
  /** [DownloadTask.onProgressUpdate(function callback)](DownloadTask.onProgressUpdate.md)
    *
    * 监听下载进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOnProgressUpdateCallback): Unit
}
object DownloadTask {
  
  inline def apply(
    abort: Callback,
    offHeadersReceived: DownloadTaskOffHeadersReceivedCallback => Callback,
    offProgressUpdate: DownloadTaskOffProgressUpdateCallback => Callback,
    onHeadersReceived: DownloadTaskOnHeadersReceivedCallback => Callback,
    onProgressUpdate: DownloadTaskOnProgressUpdateCallback => Callback
  ): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, offHeadersReceived = js.Any.fromFunction1((t0: DownloadTaskOffHeadersReceivedCallback) => offHeadersReceived(t0).runNow()), offProgressUpdate = js.Any.fromFunction1((t0: DownloadTaskOffProgressUpdateCallback) => offProgressUpdate(t0).runNow()), onHeadersReceived = js.Any.fromFunction1((t0: DownloadTaskOnHeadersReceivedCallback) => onHeadersReceived(t0).runNow()), onProgressUpdate = js.Any.fromFunction1((t0: DownloadTaskOnProgressUpdateCallback) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[DownloadTask]
  }
  
  extension [Self <: DownloadTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOffHeadersReceived(value: DownloadTaskOffHeadersReceivedCallback => Callback): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1((t0: DownloadTaskOffHeadersReceivedCallback) => value(t0).runNow()))
    
    inline def setOffProgressUpdate(value: DownloadTaskOffProgressUpdateCallback => Callback): Self = StObject.set(x, "offProgressUpdate", js.Any.fromFunction1((t0: DownloadTaskOffProgressUpdateCallback) => value(t0).runNow()))
    
    inline def setOnHeadersReceived(value: DownloadTaskOnHeadersReceivedCallback => Callback): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1((t0: DownloadTaskOnHeadersReceivedCallback) => value(t0).runNow()))
    
    inline def setOnProgressUpdate(value: DownloadTaskOnProgressUpdateCallback => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: DownloadTaskOnProgressUpdateCallback) => value(t0).runNow()))
  }
}
