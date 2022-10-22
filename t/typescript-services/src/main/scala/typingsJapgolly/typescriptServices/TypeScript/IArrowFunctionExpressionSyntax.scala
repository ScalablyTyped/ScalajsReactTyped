package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArrowFunctionExpressionSyntax
  extends StObject
     with IUnaryExpressionSyntax {
  
  var block: BlockSyntax
  
  var equalsGreaterThanToken: ISyntaxToken
  
  var expression: IExpressionSyntax
  
  def isArrowFunctionExpression(): Boolean
}
object IArrowFunctionExpressionSyntax {
  
  inline def apply(
    accept: ISyntaxVisitor => Any,
    block: BlockSyntax,
    childAt: Double => ISyntaxElement,
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    equalsGreaterThanToken: ISyntaxToken,
    expression: IExpressionSyntax,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isArrowFunctionExpression: CallbackTo[Boolean],
    isExpression: CallbackTo[Boolean],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    isUnaryExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double],
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): IArrowFunctionExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), block = block.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), equalsGreaterThanToken = equalsGreaterThanToken.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], firstToken = firstToken.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, isArrowFunctionExpression = isArrowFunctionExpression.toJsFn, isExpression = isExpression.toJsFn, isIncrementallyUnusable = isIncrementallyUnusable.toJsFn, isList = isList.toJsFn, isNode = isNode.toJsFn, isSeparatedList = isSeparatedList.toJsFn, isToken = isToken.toJsFn, isTypeScriptSpecific = isTypeScriptSpecific.toJsFn, isUnaryExpression = isUnaryExpression.toJsFn, kind = kind.toJsFn, lastToken = lastToken.toJsFn, leadingTrivia = leadingTrivia.toJsFn, leadingTriviaWidth = leadingTriviaWidth.toJsFn, trailingTrivia = trailingTrivia.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn, withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[IArrowFunctionExpressionSyntax]
  }
  
  extension [Self <: IArrowFunctionExpressionSyntax](x: Self) {
    
    inline def setBlock(value: BlockSyntax): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setEqualsGreaterThanToken(value: ISyntaxToken): Self = StObject.set(x, "equalsGreaterThanToken", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: IExpressionSyntax): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setIsArrowFunctionExpression(value: CallbackTo[Boolean]): Self = StObject.set(x, "isArrowFunctionExpression", value.toJsFn)
  }
}
