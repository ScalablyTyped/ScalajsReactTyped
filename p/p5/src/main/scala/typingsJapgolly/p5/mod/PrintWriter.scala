package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintWriter extends StObject {
  
  /**
    *   Clears the data already written to the PrintWriter
    *   object
    */
  def clear(): Unit
  
  /**
    *   Closes the PrintWriter
    */
  def close(): Unit
  
  /**
    *   Writes data to the PrintWriter stream, and adds a
    *   new line at the end
    *   @param data all data to be printed by the
    *   PrintWriter
    */
  def print(data: js.Array[Any]): Unit
  
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[Any]): Unit
}
object PrintWriter {
  
  inline def apply(
    clear: Callback,
    close: Callback,
    print: js.Array[Any] => Callback,
    write: js.Array[Any] => Callback
  ): PrintWriter = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, close = close.toJsFn, print = js.Any.fromFunction1((t0: js.Array[Any]) => print(t0).runNow()), write = js.Any.fromFunction1((t0: js.Array[Any]) => write(t0).runNow()))
    __obj.asInstanceOf[PrintWriter]
  }
  
  extension [Self <: PrintWriter](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setPrint(value: js.Array[Any] => Callback): Self = StObject.set(x, "print", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setWrite(value: js.Array[Any] => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
