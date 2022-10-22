package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxNodeOrToken
  extends StObject
     with ISyntaxElement {
  
  def accept(visitor: ISyntaxVisitor): Any
  
  def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken
  
  def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken
}
object ISyntaxNodeOrToken {
  
  inline def apply(
    accept: ISyntaxVisitor => Any,
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
    width: CallbackTo[Double],
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxNodeOrToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), firstToken = firstToken.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, isIncrementallyUnusable = isIncrementallyUnusable.toJsFn, isList = isList.toJsFn, isNode = isNode.toJsFn, isSeparatedList = isSeparatedList.toJsFn, isToken = isToken.toJsFn, isTypeScriptSpecific = isTypeScriptSpecific.toJsFn, kind = kind.toJsFn, lastToken = lastToken.toJsFn, leadingTrivia = leadingTrivia.toJsFn, leadingTriviaWidth = leadingTriviaWidth.toJsFn, trailingTrivia = trailingTrivia.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn, withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxNodeOrToken]
  }
  
  extension [Self <: ISyntaxNodeOrToken](x: Self) {
    
    inline def setAccept(value: ISyntaxVisitor => Any): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setWithLeadingTrivia(value: ISyntaxTriviaList => ISyntaxNodeOrToken): Self = StObject.set(x, "withLeadingTrivia", js.Any.fromFunction1(value))
    
    inline def setWithTrailingTrivia(value: ISyntaxTriviaList => ISyntaxNodeOrToken): Self = StObject.set(x, "withTrailingTrivia", js.Any.fromFunction1(value))
  }
}
