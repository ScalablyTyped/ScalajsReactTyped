package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def mutation(): StartPosition
}
object `5` {
  
  inline def apply(mutation: CallbackTo[StartPosition]): `5` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setMutation(value: CallbackTo[StartPosition]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
