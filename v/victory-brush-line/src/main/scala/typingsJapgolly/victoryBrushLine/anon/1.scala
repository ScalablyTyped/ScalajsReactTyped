package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def mutation(): BrushDomain
}
object `1` {
  
  inline def apply(mutation: CallbackTo[BrushDomain]): `1` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setMutation(value: CallbackTo[BrushDomain]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
