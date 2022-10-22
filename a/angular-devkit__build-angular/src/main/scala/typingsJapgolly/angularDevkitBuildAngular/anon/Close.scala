package typingsJapgolly.angularDevkitBuildAngular.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(): Unit
}
object Close {
  
  inline def apply(close: Callback): Close = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
