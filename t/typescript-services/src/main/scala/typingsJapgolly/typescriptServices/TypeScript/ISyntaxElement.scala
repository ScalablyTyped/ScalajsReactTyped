package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxElement extends StObject {
  
  def childAt(index: Double): ISyntaxElement
  
  def childCount(): Double
  
  def collectTextElements(elements: js.Array[String]): Unit
  
  def firstToken(): ISyntaxToken
  
  def fullText(): String
  
  def fullWidth(): Double
  
  def isIncrementallyUnusable(): Boolean
  
  def isList(): Boolean
  
  def isNode(): Boolean
  
  def isSeparatedList(): Boolean
  
  def isToken(): Boolean
  
  def isTypeScriptSpecific(): Boolean
  
  def kind(): SyntaxKind
  
  def lastToken(): ISyntaxToken
  
  def leadingTrivia(): ISyntaxTriviaList
  
  def leadingTriviaWidth(): Double
  
  def trailingTrivia(): ISyntaxTriviaList
  
  def trailingTriviaWidth(): Double
  
  def width(): Double
}
object ISyntaxElement {
  
  inline def apply(
    childAt: Double => ISyntaxElement,
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), firstToken = firstToken.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, isIncrementallyUnusable = isIncrementallyUnusable.toJsFn, isList = isList.toJsFn, isNode = isNode.toJsFn, isSeparatedList = isSeparatedList.toJsFn, isToken = isToken.toJsFn, isTypeScriptSpecific = isTypeScriptSpecific.toJsFn, kind = kind.toJsFn, lastToken = lastToken.toJsFn, leadingTrivia = leadingTrivia.toJsFn, leadingTriviaWidth = leadingTriviaWidth.toJsFn, trailingTrivia = trailingTrivia.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ISyntaxElement]
  }
  
  extension [Self <: ISyntaxElement](x: Self) {
    
    inline def setChildAt(value: Double => ISyntaxElement): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: CallbackTo[Double]): Self = StObject.set(x, "childCount", value.toJsFn)
    
    inline def setCollectTextElements(value: js.Array[String] => Callback): Self = StObject.set(x, "collectTextElements", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setFirstToken(value: CallbackTo[ISyntaxToken]): Self = StObject.set(x, "firstToken", value.toJsFn)
    
    inline def setFullText(value: CallbackTo[String]): Self = StObject.set(x, "fullText", value.toJsFn)
    
    inline def setFullWidth(value: CallbackTo[Double]): Self = StObject.set(x, "fullWidth", value.toJsFn)
    
    inline def setIsIncrementallyUnusable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIncrementallyUnusable", value.toJsFn)
    
    inline def setIsList(value: CallbackTo[Boolean]): Self = StObject.set(x, "isList", value.toJsFn)
    
    inline def setIsNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNode", value.toJsFn)
    
    inline def setIsSeparatedList(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSeparatedList", value.toJsFn)
    
    inline def setIsToken(value: CallbackTo[Boolean]): Self = StObject.set(x, "isToken", value.toJsFn)
    
    inline def setIsTypeScriptSpecific(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTypeScriptSpecific", value.toJsFn)
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setLastToken(value: CallbackTo[ISyntaxToken]): Self = StObject.set(x, "lastToken", value.toJsFn)
    
    inline def setLeadingTrivia(value: CallbackTo[ISyntaxTriviaList]): Self = StObject.set(x, "leadingTrivia", value.toJsFn)
    
    inline def setLeadingTriviaWidth(value: CallbackTo[Double]): Self = StObject.set(x, "leadingTriviaWidth", value.toJsFn)
    
    inline def setTrailingTrivia(value: CallbackTo[ISyntaxTriviaList]): Self = StObject.set(x, "trailingTrivia", value.toJsFn)
    
    inline def setTrailingTriviaWidth(value: CallbackTo[Double]): Self = StObject.set(x, "trailingTriviaWidth", value.toJsFn)
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
  }
}
