package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def mutation(): ParentSVG
}
object `4` {
  
  inline def apply(mutation: CallbackTo[ParentSVG]): `4` = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setMutation(value: CallbackTo[ParentSVG]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
