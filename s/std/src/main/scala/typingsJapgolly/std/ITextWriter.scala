package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextWriter extends StObject {
  
  /* standard scripthost */
  def Close(): Unit
  
  /* standard scripthost */
  def Write(s: java.lang.String): Unit
  
  /* standard scripthost */
  def WriteLine(s: java.lang.String): Unit
}
object ITextWriter {
  
  inline def apply(Close: Callback, Write: java.lang.String => Callback, WriteLine: java.lang.String => Callback): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, Write = js.Any.fromFunction1((t0: java.lang.String) => Write(t0).runNow()), WriteLine = js.Any.fromFunction1((t0: java.lang.String) => WriteLine(t0).runNow()))
    __obj.asInstanceOf[ITextWriter]
  }
  
  extension [Self <: ITextWriter](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setWrite(value: java.lang.String => Callback): Self = StObject.set(x, "Write", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
    
    inline def setWriteLine(value: java.lang.String => Callback): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
  }
}
