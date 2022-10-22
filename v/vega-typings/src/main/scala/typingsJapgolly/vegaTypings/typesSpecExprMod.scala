package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.typesSpecOnEventsMod._Update
import typingsJapgolly.vegaTypings.typesSpecTransformMod.TransformField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecExprMod {
  
  type Expr = String
  
  trait ExprRef
    extends StObject
       with TransformField
       with _Update {
    
    var expr: Expr
  }
  object ExprRef {
    
    inline def apply(expr: Expr): ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprRef]
    }
    
    extension [Self <: ExprRef](x: Self) {
      
      inline def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
}
