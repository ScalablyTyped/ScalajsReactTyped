package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression
  extends StObject
     with IASTToken {
  
  /* private */ var _text: Any
  
  /* private */ var _valueText: Any
  
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean
}
object ThisExpression {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _text: Any,
    _trailingTriviaWidth: Double,
    _valueText: Any,
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
    structuralEquals: (ParenthesizedExpression, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    text: CallbackTo[String],
    trailingTriviaWidth: CallbackTo[Double],
    valueText: CallbackTo[String],
    width: CallbackTo[Double]
  ): ThisExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, text = text.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, valueText = valueText.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ThisExpression]
  }
  
  extension [Self <: ThisExpression](x: Self) {
    
    inline def setStructuralEquals(value: (ParenthesizedExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_text(value: Any): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_valueText(value: Any): Self = StObject.set(x, "_valueText", value.asInstanceOf[js.Any])
  }
}
