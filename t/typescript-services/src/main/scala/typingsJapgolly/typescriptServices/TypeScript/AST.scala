package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AST
  extends StObject
     with IASTSpan {
  
  /* private */ var _astID: Any
  
  /* private */ var _postComments: Any
  
  /* private */ var _preComments: Any
  
  var _trailingTriviaWidth: Double
  
  def fileName(): String
  
  def isExpression(): Boolean
  
  def kind(): SyntaxKind
  
  var parent: AST
  
  def postComments(): js.Array[Comment]
  
  def preComments(): js.Array[Comment]
  
  def setPostComments(comments: js.Array[Comment]): Unit
  
  def setPreComments(comments: js.Array[Comment]): Unit
  
  def structuralEquals(ast: AST, includingPosition: Boolean): Boolean
  
  def syntaxID(): Double
  
  def trailingTriviaWidth(): Double
  
  def width(): Double
}
object AST {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
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
    width: CallbackTo[Double]
  ): AST = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[AST]
  }
  
  extension [Self <: AST](x: Self) {
    
    inline def setFileName(value: CallbackTo[String]): Self = StObject.set(x, "fileName", value.toJsFn)
    
    inline def setIsExpression(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpression", value.toJsFn)
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setParent(value: AST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPostComments(value: CallbackTo[js.Array[Comment]]): Self = StObject.set(x, "postComments", value.toJsFn)
    
    inline def setPreComments(value: CallbackTo[js.Array[Comment]]): Self = StObject.set(x, "preComments", value.toJsFn)
    
    inline def setSetPostComments(value: js.Array[Comment] => Callback): Self = StObject.set(x, "setPostComments", js.Any.fromFunction1((t0: js.Array[Comment]) => value(t0).runNow()))
    
    inline def setSetPreComments(value: js.Array[Comment] => Callback): Self = StObject.set(x, "setPreComments", js.Any.fromFunction1((t0: js.Array[Comment]) => value(t0).runNow()))
    
    inline def setStructuralEquals(value: (AST, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setSyntaxID(value: CallbackTo[Double]): Self = StObject.set(x, "syntaxID", value.toJsFn)
    
    inline def setTrailingTriviaWidth(value: CallbackTo[Double]): Self = StObject.set(x, "trailingTriviaWidth", value.toJsFn)
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
    
    inline def set_astID(value: Any): Self = StObject.set(x, "_astID", value.asInstanceOf[js.Any])
    
    inline def set_postComments(value: Any): Self = StObject.set(x, "_postComments", value.asInstanceOf[js.Any])
    
    inline def set_preComments(value: Any): Self = StObject.set(x, "_preComments", value.asInstanceOf[js.Any])
    
    inline def set_trailingTriviaWidth(value: Double): Self = StObject.set(x, "_trailingTriviaWidth", value.asInstanceOf[js.Any])
  }
}
