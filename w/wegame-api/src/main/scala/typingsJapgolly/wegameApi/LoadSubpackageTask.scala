package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSubpackageTask extends StObject {
  
  /**
    * 监听分包加载进度变化事件
    * @param callback.res.progress 分包下载进度百分比
    * @param callback.res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Progress, Unit]): Unit
}
object LoadSubpackageTask {
  
  inline def apply(onProgressUpdate: js.Function1[/* res */ Progress, Unit] => Callback): LoadSubpackageTask = {
    val __obj = js.Dynamic.literal(onProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ Progress, Unit]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[LoadSubpackageTask]
  }
  
  extension [Self <: LoadSubpackageTask](x: Self) {
    
    inline def setOnProgressUpdate(value: js.Function1[/* res */ Progress, Unit] => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ Progress, Unit]) => value(t0).runNow()))
  }
}
