package typingsJapgolly.expoXcpretty.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnData extends StObject {
  
  def onData(data: Buffer): Unit
  
  def onEnd(code: Double): Unit
  
  def onErr(data: Buffer): Unit
}
object OnData {
  
  inline def apply(onData: Buffer => Callback, onEnd: Double => Callback, onErr: Buffer => Callback): OnData = {
    val __obj = js.Dynamic.literal(onData = js.Any.fromFunction1((t0: Buffer) => onData(t0).runNow()), onEnd = js.Any.fromFunction1((t0: Double) => onEnd(t0).runNow()), onErr = js.Any.fromFunction1((t0: Buffer) => onErr(t0).runNow()))
    __obj.asInstanceOf[OnData]
  }
  
  extension [Self <: OnData](x: Self) {
    
    inline def setOnData(value: Buffer => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
    
    inline def setOnEnd(value: Double => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnErr(value: Buffer => Callback): Self = StObject.set(x, "onErr", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
  }
}
