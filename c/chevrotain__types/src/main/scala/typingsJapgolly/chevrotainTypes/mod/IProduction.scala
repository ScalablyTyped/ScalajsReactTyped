package typingsJapgolly.chevrotainTypes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProduction extends StObject {
  
  def accept(visitor: IGASTVisitor): Unit
}
object IProduction {
  
  inline def apply(accept: IGASTVisitor => Callback): IProduction = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1((t0: IGASTVisitor) => accept(t0).runNow()))
    __obj.asInstanceOf[IProduction]
  }
  
  extension [Self <: IProduction](x: Self) {
    
    inline def setAccept(value: IGASTVisitor => Callback): Self = StObject.set(x, "accept", js.Any.fromFunction1((t0: IGASTVisitor) => value(t0).runNow()))
  }
}
