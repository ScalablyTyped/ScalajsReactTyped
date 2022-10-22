package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.TotalBytesExpectedToSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadTask extends StObject {
  
  /**
    * 中断上传任务
    */
  def abort(): Unit
  
  /**
    * 监听上传进度变化事件
    * @param callback.res.progress 上传进度百分比
    * @param callback.res.totalBytesSent 已经上传的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToSend 预期需要上传的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]): Unit
}
object UploadTask {
  
  inline def apply(
    abort: Callback,
    onProgressUpdate: js.Function1[/* res */ TotalBytesExpectedToSend, Unit] => Callback
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, onProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[UploadTask]
  }
  
  extension [Self <: UploadTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setOnProgressUpdate(value: js.Function1[/* res */ TotalBytesExpectedToSend, Unit] => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]) => value(t0).runNow()))
  }
}
