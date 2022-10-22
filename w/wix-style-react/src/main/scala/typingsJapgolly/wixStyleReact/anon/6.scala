package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def close(): Unit
}
object `6` {
  
  inline def apply(close: Callback): `6` = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
