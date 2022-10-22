package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutation extends StObject {
  
  def mutation(): ActiveBrushes
}
object Mutation {
  
  inline def apply(mutation: CallbackTo[ActiveBrushes]): Mutation = {
    val __obj = js.Dynamic.literal(mutation = mutation.toJsFn)
    __obj.asInstanceOf[Mutation]
  }
  
  extension [Self <: Mutation](x: Self) {
    
    inline def setMutation(value: CallbackTo[ActiveBrushes]): Self = StObject.set(x, "mutation", value.toJsFn)
  }
}
