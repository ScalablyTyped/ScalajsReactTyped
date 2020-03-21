package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax {
  def this(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
object WhileStatementSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax = js.native
}

