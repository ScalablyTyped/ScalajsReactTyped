package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  def atEnd(): Boolean
  
  def close(): Unit
  
  def flush(): Unit
  
  def read(): String
  
  def readLine(): String
  
  def seek(position: Double): Unit
  
  def write(data: String): Unit
  
  def writeLine(data: String): Unit
}
object Stream {
  
  inline def apply(
    atEnd: CallbackTo[Boolean],
    close: Callback,
    flush: Callback,
    read: CallbackTo[String],
    readLine: CallbackTo[String],
    seek: Double => Callback,
    write: String => Callback,
    writeLine: String => Callback
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = atEnd.toJsFn, close = close.toJsFn, flush = flush.toJsFn, read = read.toJsFn, readLine = readLine.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), write = js.Any.fromFunction1((t0: String) => write(t0).runNow()), writeLine = js.Any.fromFunction1((t0: String) => writeLine(t0).runNow()))
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setAtEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "atEnd", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setRead(value: CallbackTo[String]): Self = StObject.set(x, "read", value.toJsFn)
    
    inline def setReadLine(value: CallbackTo[String]): Self = StObject.set(x, "readLine", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteLine(value: String => Callback): Self = StObject.set(x, "writeLine", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
