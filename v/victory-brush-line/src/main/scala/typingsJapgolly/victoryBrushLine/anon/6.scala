package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def mutation(): ActiveBrushesActiveHandle
}
object `6` {
  
  inline def apply(mutation: CallbackTo[ActiveBrushesActiveHandle]): `6` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setMutation(value: CallbackTo[ActiveBrushesActiveHandle]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
