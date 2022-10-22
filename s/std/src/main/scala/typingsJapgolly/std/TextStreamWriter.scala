package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStreamWriter
  extends StObject
     with TextStreamBase {
  
  /**
    * Sends a string to an output stream.
    */
  /* standard scripthost */
  def Write(s: java.lang.String): Unit
  
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  /* standard scripthost */
  def WriteBlankLines(intLines: Double): Unit
  
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  /* standard scripthost */
  def WriteLine(s: java.lang.String): Unit
}
object TextStreamWriter {
  
  inline def apply(
    Close: Callback,
    Column: Double,
    Line: Double,
    Write: java.lang.String => Callback,
    WriteBlankLines: Double => Callback,
    WriteLine: java.lang.String => Callback
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Write = js.Any.fromFunction1((t0: java.lang.String) => Write(t0).runNow()), WriteBlankLines = js.Any.fromFunction1((t0: Double) => WriteBlankLines(t0).runNow()), WriteLine = js.Any.fromFunction1((t0: java.lang.String) => WriteLine(t0).runNow()))
    __obj.asInstanceOf[TextStreamWriter]
  }
  
  extension [Self <: TextStreamWriter](x: Self) {
    
    inline def setWrite(value: java.lang.String => Callback): Self = StObject.set(x, "Write", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
    
    inline def setWriteBlankLines(value: Double => Callback): Self = StObject.set(x, "WriteBlankLines", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteLine(value: java.lang.String => Callback): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
  }
}
