package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ElementAccessExpressionSyntax")
@js.native
class ElementAccessExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ElementAccessExpressionSyntax")
@js.native
object ElementAccessExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax, argumentExpression: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
}

