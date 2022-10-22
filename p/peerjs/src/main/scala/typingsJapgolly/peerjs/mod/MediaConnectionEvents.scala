package typingsJapgolly.peerjs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConnectionEvents extends StObject {
  
  /**
    * Emitted when a connection to the PeerServer is established.
    */
  def stream(stream: MediaStream): Unit
}
object MediaConnectionEvents {
  
  inline def apply(stream: MediaStream => Callback): MediaConnectionEvents = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1((t0: MediaStream) => stream(t0).runNow()))
    __obj.asInstanceOf[MediaConnectionEvents]
  }
  
  extension [Self <: MediaConnectionEvents](x: Self) {
    
    inline def setStream(value: MediaStream => Callback): Self = StObject.set(x, "stream", js.Any.fromFunction1((t0: MediaStream) => value(t0).runNow()))
  }
}
