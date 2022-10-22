package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioPlayer extends StObject {
  
  /**
    * Playback control callback, emitted for each corresponding Animation::seek().
    *
    * Will seek to time t (seconds) relative to the layer's timeline origin.
    * Negative t values are used to signal off state (stop playback outside layer span).
    */
  def seek(t: Double): Unit
}
object AudioPlayer {
  
  inline def apply(seek: Double => Callback): AudioPlayer = {
    val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()))
    __obj.asInstanceOf[AudioPlayer]
  }
  
  extension [Self <: AudioPlayer](x: Self) {
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
