package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExpressionSyntax
  extends StObject
     with SyntaxNode
     with IUnaryExpressionSyntax {
  
  var deleteKeyword: ISyntaxToken = js.native
  
  var expression: IUnaryExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  def update(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
  
  def withDeleteKeyword(deleteKeyword: ISyntaxToken): DeleteExpressionSyntax = js.native
  
  def withExpression(expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
}
