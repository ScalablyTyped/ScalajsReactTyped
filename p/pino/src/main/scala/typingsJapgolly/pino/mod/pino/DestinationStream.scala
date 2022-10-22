package typingsJapgolly.pino.mod.pino

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationStream extends StObject {
  
  def write(msg: String): Unit
}
object DestinationStream {
  
  inline def apply(write: String => Callback): DestinationStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
    __obj.asInstanceOf[DestinationStream]
  }
  
  extension [Self <: DestinationStream](x: Self) {
    
    inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
