package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected () extends SyntaxNode {
  def this(
    propertyName: ISyntaxToken,
    colonToken: ISyntaxToken,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var colonToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
object SimplePropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
}

