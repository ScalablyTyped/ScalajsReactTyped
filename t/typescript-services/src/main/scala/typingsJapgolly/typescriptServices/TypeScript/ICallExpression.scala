package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallExpression
  extends StObject
     with IASTSpan {
  
  var argumentList: ArgumentList
  
  var expression: AST
}
object ICallExpression {
  
  inline def apply(
    _end: Double,
    _start: Double,
    argumentList: ArgumentList,
    end: CallbackTo[Double],
    expression: AST,
    start: CallbackTo[Double]
  ): ICallExpression = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], end = end.toJsFn, expression = expression.asInstanceOf[js.Any], start = start.toJsFn)
    __obj.asInstanceOf[ICallExpression]
  }
  
  extension [Self <: ICallExpression](x: Self) {
    
    inline def setArgumentList(value: ArgumentList): Self = StObject.set(x, "argumentList", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: AST): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
