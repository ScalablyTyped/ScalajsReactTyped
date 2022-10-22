package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the StartAsync result that contains the created PlayReady-ND MediaStreamSource instance. */
trait INDStartResult extends StObject {
  
  /** Gets the MediaStreamSource object for the data that the transmitter streams. */
  var mediaStreamSource: MediaStreamSource
}
object INDStartResult {
  
  inline def apply(mediaStreamSource: MediaStreamSource): INDStartResult = {
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDStartResult]
  }
  
  extension [Self <: INDStartResult](x: Self) {
    
    inline def setMediaStreamSource(value: MediaStreamSource): Self = StObject.set(x, "mediaStreamSource", value.asInstanceOf[js.Any])
  }
}
