package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def close(): Unit
}
object `11` {
  
  inline def apply(close: Callback): `11` = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
