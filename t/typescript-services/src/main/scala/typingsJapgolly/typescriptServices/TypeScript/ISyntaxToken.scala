package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxToken
  extends StObject
     with IPrimaryExpressionSyntax {
  
  def hasLeadingComment(): Boolean
  
  def hasLeadingNewLine(): Boolean
  
  def hasLeadingSkippedText(): Boolean
  
  def hasLeadingTrivia(): Boolean
  
  def hasSkippedToken(): Boolean
  
  def hasTrailingComment(): Boolean
  
  def hasTrailingNewLine(): Boolean
  
  def hasTrailingSkippedText(): Boolean
  
  def hasTrailingTrivia(): Boolean
  
  def text(): String
  
  var tokenKind: SyntaxKind
  
  def value(): Any
  
  def valueText(): String
}
object ISyntaxToken {
  
  inline def apply(
    accept: ISyntaxVisitor => Any,
    childAt: Double => ISyntaxElement,
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    hasLeadingComment: CallbackTo[Boolean],
    hasLeadingNewLine: CallbackTo[Boolean],
    hasLeadingSkippedText: CallbackTo[Boolean],
    hasLeadingTrivia: CallbackTo[Boolean],
    hasSkippedToken: CallbackTo[Boolean],
    hasTrailingComment: CallbackTo[Boolean],
    hasTrailingNewLine: CallbackTo[Boolean],
    hasTrailingSkippedText: CallbackTo[Boolean],
    hasTrailingTrivia: CallbackTo[Boolean],
    isExpression: CallbackTo[Boolean],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isMemberExpression: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isPostfixExpression: CallbackTo[Boolean],
    isPrimaryExpression: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    isUnaryExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    text: CallbackTo[String],
    tokenKind: SyntaxKind,
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    value: CallbackTo[Any],
    valueText: CallbackTo[String],
    width: CallbackTo[Double],
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), firstToken = firstToken.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, hasLeadingComment = hasLeadingComment.toJsFn, hasLeadingNewLine = hasLeadingNewLine.toJsFn, hasLeadingSkippedText = hasLeadingSkippedText.toJsFn, hasLeadingTrivia = hasLeadingTrivia.toJsFn, hasSkippedToken = hasSkippedToken.toJsFn, hasTrailingComment = hasTrailingComment.toJsFn, hasTrailingNewLine = hasTrailingNewLine.toJsFn, hasTrailingSkippedText = hasTrailingSkippedText.toJsFn, hasTrailingTrivia = hasTrailingTrivia.toJsFn, isExpression = isExpression.toJsFn, isIncrementallyUnusable = isIncrementallyUnusable.toJsFn, isList = isList.toJsFn, isMemberExpression = isMemberExpression.toJsFn, isNode = isNode.toJsFn, isPostfixExpression = isPostfixExpression.toJsFn, isPrimaryExpression = isPrimaryExpression.toJsFn, isSeparatedList = isSeparatedList.toJsFn, isToken = isToken.toJsFn, isTypeScriptSpecific = isTypeScriptSpecific.toJsFn, isUnaryExpression = isUnaryExpression.toJsFn, kind = kind.toJsFn, lastToken = lastToken.toJsFn, leadingTrivia = leadingTrivia.toJsFn, leadingTriviaWidth = leadingTriviaWidth.toJsFn, text = text.toJsFn, tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = trailingTrivia.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, value = value.toJsFn, valueText = valueText.toJsFn, width = width.toJsFn, withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxToken]
  }
  
  extension [Self <: ISyntaxToken](x: Self) {
    
    inline def setHasLeadingComment(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLeadingComment", value.toJsFn)
    
    inline def setHasLeadingNewLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLeadingNewLine", value.toJsFn)
    
    inline def setHasLeadingSkippedText(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLeadingSkippedText", value.toJsFn)
    
    inline def setHasLeadingTrivia(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLeadingTrivia", value.toJsFn)
    
    inline def setHasSkippedToken(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSkippedToken", value.toJsFn)
    
    inline def setHasTrailingComment(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTrailingComment", value.toJsFn)
    
    inline def setHasTrailingNewLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTrailingNewLine", value.toJsFn)
    
    inline def setHasTrailingSkippedText(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTrailingSkippedText", value.toJsFn)
    
    inline def setHasTrailingTrivia(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTrailingTrivia", value.toJsFn)
    
    inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setTokenKind(value: SyntaxKind): Self = StObject.set(x, "tokenKind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
    
    inline def setValueText(value: CallbackTo[String]): Self = StObject.set(x, "valueText", value.toJsFn)
  }
}
