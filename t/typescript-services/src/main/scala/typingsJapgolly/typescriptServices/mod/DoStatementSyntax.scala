package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax {
  def this(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax = js.native
}

