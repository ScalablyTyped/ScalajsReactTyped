package typingsJapgolly.ipfsBitswap.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  def cancel(): Unit
  
  def flush(): Unit
}
object Cancel {
  
  inline def apply(cancel: Callback, flush: Callback): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn)
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
  }
}
