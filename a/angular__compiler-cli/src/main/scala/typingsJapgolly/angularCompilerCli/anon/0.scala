package typingsJapgolly.angularCompilerCli.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def close(): Unit
}
object `0` {
  
  inline def apply(close: Callback): `0` = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
