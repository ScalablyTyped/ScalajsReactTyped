package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def tap(): scala.Nothing
}
object `0` {
  
  inline def apply(tap: CallbackTo[scala.Nothing]): `0` = {
    val __obj = js.Dynamic.literal(tap = tap.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setTap(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "tap", value.toJsFn)
  }
}
