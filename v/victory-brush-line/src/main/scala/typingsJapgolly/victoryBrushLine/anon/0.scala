package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def mutation(): ActiveHandle
}
object `0` {
  
  inline def apply(mutation: CallbackTo[ActiveHandle]): `0` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setMutation(value: CallbackTo[ActiveHandle]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
