package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxTriviaList extends StObject {
  
  def collectTextElements(elements: js.Array[String]): Unit
  
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList
  
  def count(): Double
  
  def fullText(): String
  
  def fullWidth(): Double
  
  def hasComment(): Boolean
  
  def hasNewLine(): Boolean
  
  def hasSkippedToken(): Boolean
  
  def last(): ISyntaxTrivia
  
  def syntaxTriviaAt(index: Double): ISyntaxTrivia
  
  def toArray(): js.Array[ISyntaxTrivia]
}
object ISyntaxTriviaList {
  
  inline def apply(
    collectTextElements: js.Array[String] => Callback,
    concat: ISyntaxTriviaList => ISyntaxTriviaList,
    count: CallbackTo[Double],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    hasComment: CallbackTo[Boolean],
    hasNewLine: CallbackTo[Boolean],
    hasSkippedToken: CallbackTo[Boolean],
    last: CallbackTo[ISyntaxTrivia],
    syntaxTriviaAt: Double => ISyntaxTrivia,
    toArray: CallbackTo[js.Array[ISyntaxTrivia]]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal(collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), concat = js.Any.fromFunction1(concat), count = count.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, hasComment = hasComment.toJsFn, hasNewLine = hasNewLine.toJsFn, hasSkippedToken = hasSkippedToken.toJsFn, last = last.toJsFn, syntaxTriviaAt = js.Any.fromFunction1(syntaxTriviaAt), toArray = toArray.toJsFn)
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
  
  extension [Self <: ISyntaxTriviaList](x: Self) {
    
    inline def setCollectTextElements(value: js.Array[String] => Callback): Self = StObject.set(x, "collectTextElements", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setConcat(value: ISyntaxTriviaList => ISyntaxTriviaList): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setFullText(value: CallbackTo[String]): Self = StObject.set(x, "fullText", value.toJsFn)
    
    inline def setFullWidth(value: CallbackTo[Double]): Self = StObject.set(x, "fullWidth", value.toJsFn)
    
    inline def setHasComment(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasComment", value.toJsFn)
    
    inline def setHasNewLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNewLine", value.toJsFn)
    
    inline def setHasSkippedToken(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSkippedToken", value.toJsFn)
    
    inline def setLast(value: CallbackTo[ISyntaxTrivia]): Self = StObject.set(x, "last", value.toJsFn)
    
    inline def setSyntaxTriviaAt(value: Double => ISyntaxTrivia): Self = StObject.set(x, "syntaxTriviaAt", js.Any.fromFunction1(value))
    
    inline def setToArray(value: CallbackTo[js.Array[ISyntaxTrivia]]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
