package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadTask extends StObject {
  
  /**
    * 中断下载任务
    */
  def abort(): Unit
  
  /**
    * 监听下载进度变化事件
    * @param res.progress 下载进度百分比，值为0至100
    * @param res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Progress, Unit]): Unit
}
object DownloadTask {
  
  inline def apply(abort: Callback, onProgressUpdate: js.Function1[/* res */ Progress, Unit] => Callback): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, onProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ Progress, Unit]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[DownloadTask]
  }
  
  extension [Self <: DownloadTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOnProgressUpdate(value: js.Function1[/* res */ Progress, Unit] => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ Progress, Unit]) => value(t0).runNow()))
  }
}
