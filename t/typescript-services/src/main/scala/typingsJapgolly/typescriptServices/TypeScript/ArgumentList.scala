package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentList
  extends StObject
     with AST {
  
  var arguments: ISeparatedSyntaxList2
  
  var closeParenToken: ASTSpan
  
  var typeArgumentList: TypeArgumentList
}
object ArgumentList {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    arguments: ISeparatedSyntaxList2,
    closeParenToken: ASTSpan,
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
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    typeArgumentList: TypeArgumentList,
    width: CallbackTo[Double]
  ): ArgumentList = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], closeParenToken = closeParenToken.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, typeArgumentList = typeArgumentList.asInstanceOf[js.Any], width = width.toJsFn)
    __obj.asInstanceOf[ArgumentList]
  }
  
  extension [Self <: ArgumentList](x: Self) {
    
    inline def setArguments(value: ISeparatedSyntaxList2): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCloseParenToken(value: ASTSpan): Self = StObject.set(x, "closeParenToken", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentList(value: TypeArgumentList): Self = StObject.set(x, "typeArgumentList", value.asInstanceOf[js.Any])
  }
}
