package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a download engine plug-in uses to send notifications to a PlayReady-ND client. */
trait NDDownloadEngineNotifier extends StObject {
  
  /**
    * Called by the download engine when a content identifier is received.
    * @param licenseFetchDescriptor The license from which the download engine receives the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit
  
  /**
    * Called by the download engine when it receives data.
    * @param dataBytes The byte array that holds the data.
    * @param bytesReceived The number of bytes received from the data stream.
    */
  def onDataReceived(dataBytes: js.Array[Double], bytesReceived: Double): Unit
  
  /** Called by the download engine when it reaches the end of a PlayReady-ND media stream. */
  def onEndOfStream(): Unit
  
  /** Called by the download engine if an error occurs during downloading. */
  def onNetworkError(): Unit
  
  /**
    * Called by the download engine once a PlayReady object is received.
    * @param dataBytes The byte array that holds the PlayReady object.
    */
  def onPlayReadyObjectReceived(dataBytes: js.Array[Double]): Unit
  
  /** Called by the download engine when a stream is opened. */
  def onStreamOpened(): Unit
}
object NDDownloadEngineNotifier {
  
  inline def apply(
    onContentIDReceived: INDLicenseFetchDescriptor => Callback,
    onDataReceived: (js.Array[Double], Double) => Callback,
    onEndOfStream: Callback,
    onNetworkError: Callback,
    onPlayReadyObjectReceived: js.Array[Double] => Callback,
    onStreamOpened: Callback
  ): NDDownloadEngineNotifier = {
    val __obj = js.Dynamic.literal(onContentIDReceived = js.Any.fromFunction1((t0: INDLicenseFetchDescriptor) => onContentIDReceived(t0).runNow()), onDataReceived = js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (onDataReceived(t0, t1)).runNow()), onEndOfStream = onEndOfStream.toJsFn, onNetworkError = onNetworkError.toJsFn, onPlayReadyObjectReceived = js.Any.fromFunction1((t0: js.Array[Double]) => onPlayReadyObjectReceived(t0).runNow()), onStreamOpened = onStreamOpened.toJsFn)
    __obj.asInstanceOf[NDDownloadEngineNotifier]
  }
  
  extension [Self <: NDDownloadEngineNotifier](x: Self) {
    
    inline def setOnContentIDReceived(value: INDLicenseFetchDescriptor => Callback): Self = StObject.set(x, "onContentIDReceived", js.Any.fromFunction1((t0: INDLicenseFetchDescriptor) => value(t0).runNow()))
    
    inline def setOnDataReceived(value: (js.Array[Double], Double) => Callback): Self = StObject.set(x, "onDataReceived", js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnEndOfStream(value: Callback): Self = StObject.set(x, "onEndOfStream", value.toJsFn)
    
    inline def setOnNetworkError(value: Callback): Self = StObject.set(x, "onNetworkError", value.toJsFn)
    
    inline def setOnPlayReadyObjectReceived(value: js.Array[Double] => Callback): Self = StObject.set(x, "onPlayReadyObjectReceived", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setOnStreamOpened(value: Callback): Self = StObject.set(x, "onStreamOpened", value.toJsFn)
  }
}
