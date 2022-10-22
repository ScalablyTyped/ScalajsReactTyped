package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceUnit
  extends StObject
     with AST {
  
  /* private */ var _fileName: Any
  
  var endOfFileTokenLeadingComments: js.Array[Comment]
  
  var moduleElements: ISyntaxList2
  
  def structuralEquals(ast: SourceUnit, includingPosition: Boolean): Boolean
}
object SourceUnit {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _fileName: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: CallbackTo[Double],
    endOfFileTokenLeadingComments: js.Array[Comment],
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    moduleElements: ISyntaxList2,
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (SourceUnit, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = end.toJsFn, endOfFileTokenLeadingComments = endOfFileTokenLeadingComments.asInstanceOf[js.Any], fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, moduleElements = moduleElements.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[SourceUnit]
  }
  
  extension [Self <: SourceUnit](x: Self) {
    
    inline def setEndOfFileTokenLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "endOfFileTokenLeadingComments", value.asInstanceOf[js.Any])
    
    inline def setEndOfFileTokenLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "endOfFileTokenLeadingComments", js.Array(value*))
    
    inline def setModuleElements(value: ISyntaxList2): Self = StObject.set(x, "moduleElements", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (SourceUnit, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
  }
}
