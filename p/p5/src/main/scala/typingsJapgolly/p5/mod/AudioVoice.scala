package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioVoice extends StObject {
  
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): Unit
  
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): Unit
}
object AudioVoice {
  
  inline def apply(connect: js.Object => Callback, disconnect: Callback): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1((t0: js.Object) => connect(t0).runNow()), disconnect = disconnect.toJsFn)
    __obj.asInstanceOf[AudioVoice]
  }
  
  extension [Self <: AudioVoice](x: Self) {
    
    inline def setConnect(value: js.Object => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
  }
}
