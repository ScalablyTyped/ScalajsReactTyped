package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def tap(): Unit
}
object `1` {
  
  inline def apply(tap: Callback): `1` = {
    val __obj = js.Dynamic.literal(tap = tap.toJsFn)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setTap(value: Callback): Self = StObject.set(x, "tap", value.toJsFn)
  }
}
