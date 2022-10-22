package typingsJapgolly.tampermonkey.Tampermonkey

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTabObject extends StObject {
  
  /** Closes tab */
  def close(): Unit
  
  var closed: Boolean
  
  /** Set closed listener */
  var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OpenTabObject {
  
  inline def apply(close: Callback, closed: Boolean): OpenTabObject = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTabObject]
  }
  
  extension [Self <: OpenTabObject](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setOnclose(value: Callback): Self = StObject.set(x, "onclose", value.toJsFn)
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
  }
}
