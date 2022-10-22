package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def mutation(): IsPanning
}
object `3` {
  
  inline def apply(mutation: CallbackTo[IsPanning]): `3` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setMutation(value: CallbackTo[IsPanning]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
