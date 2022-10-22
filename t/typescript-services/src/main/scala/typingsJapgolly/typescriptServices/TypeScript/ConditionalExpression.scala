package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalExpression
  extends StObject
     with AST {
  
  var condition: AST
  
  def structuralEquals(ast: ConditionalExpression, includingPosition: Boolean): Boolean
  
  var whenFalse: AST
  
  var whenTrue: AST
}
object ConditionalExpression {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    condition: AST,
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (ConditionalExpression, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    whenFalse: AST,
    whenTrue: AST,
    width: CallbackTo[Double]
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, whenFalse = whenFalse.asInstanceOf[js.Any], whenTrue = whenTrue.asInstanceOf[js.Any], width = width.toJsFn)
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  extension [Self <: ConditionalExpression](x: Self) {
    
    inline def setCondition(value: AST): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ConditionalExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setWhenFalse(value: AST): Self = StObject.set(x, "whenFalse", value.asInstanceOf[js.Any])
    
    inline def setWhenTrue(value: AST): Self = StObject.set(x, "whenTrue", value.asInstanceOf[js.Any])
  }
}
