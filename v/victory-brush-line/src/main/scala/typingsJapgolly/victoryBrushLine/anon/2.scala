package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def mutation(): IsSelecting
}
object `2` {
  
  inline def apply(mutation: CallbackTo[IsSelecting]): `2` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setMutation(value: CallbackTo[IsSelecting]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
