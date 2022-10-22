package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeparatedSyntaxList2
  extends StObject
     with AST {
  
  /* private */ var _fileName: Any
  
  /* private */ var _separatorCount: Any
  
  /* private */ var members: Any
  
  def nonSeparatorAt(index: Double): AST
  
  def nonSeparatorCount(): Double
  
  def nonSeparatorIndexOf(ast: AST): Double
  
  def separatorCount(): Double
  
  def structuralEquals(ast: ISeparatedSyntaxList2, includingPosition: Boolean): Boolean
}
object ISeparatedSyntaxList2 {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _fileName: Any,
    _postComments: Any,
    _preComments: Any,
    _separatorCount: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    members: Any,
    nonSeparatorAt: Double => AST,
    nonSeparatorCount: CallbackTo[Double],
    nonSeparatorIndexOf: AST => Double,
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    separatorCount: CallbackTo[Double],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (ISeparatedSyntaxList2, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ISeparatedSyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _separatorCount = _separatorCount.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, members = members.asInstanceOf[js.Any], nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = nonSeparatorCount.toJsFn, nonSeparatorIndexOf = js.Any.fromFunction1(nonSeparatorIndexOf), parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, separatorCount = separatorCount.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ISeparatedSyntaxList2]
  }
  
  extension [Self <: ISeparatedSyntaxList2](x: Self) {
    
    inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setNonSeparatorAt(value: Double => AST): Self = StObject.set(x, "nonSeparatorAt", js.Any.fromFunction1(value))
    
    inline def setNonSeparatorCount(value: CallbackTo[Double]): Self = StObject.set(x, "nonSeparatorCount", value.toJsFn)
    
    inline def setNonSeparatorIndexOf(value: AST => Double): Self = StObject.set(x, "nonSeparatorIndexOf", js.Any.fromFunction1(value))
    
    inline def setSeparatorCount(value: CallbackTo[Double]): Self = StObject.set(x, "separatorCount", value.toJsFn)
    
    inline def setStructuralEquals(value: (ISeparatedSyntaxList2, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_separatorCount(value: Any): Self = StObject.set(x, "_separatorCount", value.asInstanceOf[js.Any])
  }
}
