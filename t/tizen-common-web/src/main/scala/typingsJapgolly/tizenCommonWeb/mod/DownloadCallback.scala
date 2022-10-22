package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadCallback extends StObject {
  
  /**
    * Called when the download operation is canceled by the _cancel()_ method.
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  def oncanceled(downloadId: Double): Unit
  
  /**
    * Called when the download operation is completed with the final full path or virtual path.
    * If the same file name already exists in the destination, it is changed according to the platform policy and delivered in this callback.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param path The final full path or virtual path for the downloaded file.
    */
  def oncompleted(downloadId: Double, path: String): Unit
  
  /**
    * Called when the download operation fails.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param error The reason for download failure.
    */
  def onfailed(downloadId: Double, error: WebAPIError): Unit
  
  /**
    * Called when the download operation is paused by the _pause()_ method.
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  def onpaused(downloadId: Double): Unit
  
  /**
    * Called when a download is successful and it is called multiple times as the download progresses.
    * The interval between the _onprogress()_ callback is platform-dependent. When the download is started, the _receivedSize_ can be 0.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param receivedSize The size of data received in bytes.
    * @param totalSize The total size of data to receive in bytes.
    */
  def onprogress(downloadId: Double, receivedSize: Double, totalSize: Double): Unit
}
object DownloadCallback {
  
  inline def apply(
    oncanceled: Double => Callback,
    oncompleted: (Double, String) => Callback,
    onfailed: (Double, WebAPIError) => Callback,
    onpaused: Double => Callback,
    onprogress: (Double, Double, Double) => Callback
  ): DownloadCallback = {
    val __obj = js.Dynamic.literal(oncanceled = js.Any.fromFunction1((t0: Double) => oncanceled(t0).runNow()), oncompleted = js.Any.fromFunction2((t0: Double, t1: String) => (oncompleted(t0, t1)).runNow()), onfailed = js.Any.fromFunction2((t0: Double, t1: WebAPIError) => (onfailed(t0, t1)).runNow()), onpaused = js.Any.fromFunction1((t0: Double) => onpaused(t0).runNow()), onprogress = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onprogress(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DownloadCallback]
  }
  
  extension [Self <: DownloadCallback](x: Self) {
    
    inline def setOncanceled(value: Double => Callback): Self = StObject.set(x, "oncanceled", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOncompleted(value: (Double, String) => Callback): Self = StObject.set(x, "oncompleted", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOnfailed(value: (Double, WebAPIError) => Callback): Self = StObject.set(x, "onfailed", js.Any.fromFunction2((t0: Double, t1: WebAPIError) => (value(t0, t1)).runNow()))
    
    inline def setOnpaused(value: Double => Callback): Self = StObject.set(x, "onpaused", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnprogress(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "onprogress", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
