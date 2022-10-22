package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var _end: Double
  
  var _start: Double
  
  /* private */ var _trivia: Any
  
  def end(): Double
  
  var endsLine: Boolean
  
  def fullText(): String
  
  def kind(): SyntaxKind
  
  def start(): Double
  
  def structuralEquals(ast: Comment, includingPosition: Boolean): Boolean
}
object Comment {
  
  inline def apply(
    _end: Double,
    _start: Double,
    _trivia: Any,
    end: CallbackTo[Double],
    endsLine: Boolean,
    fullText: CallbackTo[String],
    kind: CallbackTo[SyntaxKind],
    start: CallbackTo[Double],
    structuralEquals: (Comment, Boolean) => Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trivia = _trivia.asInstanceOf[js.Any], end = end.toJsFn, endsLine = endsLine.asInstanceOf[js.Any], fullText = fullText.toJsFn, kind = kind.toJsFn, start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals))
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setEndsLine(value: Boolean): Self = StObject.set(x, "endsLine", value.asInstanceOf[js.Any])
    
    inline def setFullText(value: CallbackTo[String]): Self = StObject.set(x, "fullText", value.toJsFn)
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStructuralEquals(value: (Comment, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_end(value: Double): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_trivia(value: Any): Self = StObject.set(x, "_trivia", value.asInstanceOf[js.Any])
  }
}
