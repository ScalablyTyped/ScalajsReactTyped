package typingsJapgolly.thrift.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TStructLike extends StObject {
  
  def read(input: TProtocol): Unit
  
  def write(output: TProtocol): Unit
}
object TStructLike {
  
  inline def apply(read: TProtocol => Callback, write: TProtocol => Callback): TStructLike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1((t0: TProtocol) => read(t0).runNow()), write = js.Any.fromFunction1((t0: TProtocol) => write(t0).runNow()))
    __obj.asInstanceOf[TStructLike]
  }
  
  extension [Self <: TStructLike](x: Self) {
    
    inline def setRead(value: TProtocol => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: TProtocol) => value(t0).runNow()))
    
    inline def setWrite(value: TProtocol => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: TProtocol) => value(t0).runNow()))
  }
}
