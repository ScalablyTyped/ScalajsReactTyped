package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxList2
  extends StObject
     with AST {
  
  /* private */ var _fileName: Any
  
  def any(func: js.Function1[/* v */ AST, Boolean]): Boolean
  
  def childAt(index: Double): AST
  
  def childCount(): Double
  
  def firstOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  
  def lastOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  
  /* private */ var members: Any
  
  def structuralEquals(ast: ISyntaxList2, includingPosition: Boolean): Boolean
}
object ISyntaxList2 {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _fileName: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    any: js.Function1[/* v */ AST, Boolean] => Boolean,
    childAt: Double => AST,
    childCount: CallbackTo[Double],
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    firstOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    members: Any,
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (ISyntaxList2, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ISyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], any = js.Any.fromFunction1(any), childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, end = end.toJsFn, fileName = fileName.toJsFn, firstOrDefault = js.Any.fromFunction1(firstOrDefault), isExpression = isExpression.toJsFn, kind = kind.toJsFn, lastOrDefault = js.Any.fromFunction1(lastOrDefault), members = members.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ISyntaxList2]
  }
  
  extension [Self <: ISyntaxList2](x: Self) {
    
    inline def setAny(value: js.Function1[/* v */ AST, Boolean] => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
    
    inline def setChildAt(value: Double => AST): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: CallbackTo[Double]): Self = StObject.set(x, "childCount", value.toJsFn)
    
    inline def setFirstOrDefault(value: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST): Self = StObject.set(x, "firstOrDefault", js.Any.fromFunction1(value))
    
    inline def setLastOrDefault(value: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST): Self = StObject.set(x, "lastOrDefault", js.Any.fromFunction1(value))
    
    inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ISyntaxList2, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
  }
}
