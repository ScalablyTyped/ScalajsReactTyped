package typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
trait AdaptiveMediaSourceDownloadRequestedDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
  def complete(): Unit
}
object AdaptiveMediaSourceDownloadRequestedDeferral {
  
  inline def apply(complete: Callback): AdaptiveMediaSourceDownloadRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedDeferral]
  }
  
  extension [Self <: AdaptiveMediaSourceDownloadRequestedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
