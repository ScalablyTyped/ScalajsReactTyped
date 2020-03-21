package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ForStatementSyntax")
@js.native
class ForStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ForStatementSyntax")
@js.native
object ForStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    firstSemicolonToken: ISyntaxToken,
    secondSemicolonToken: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax = js.native
  def create1(statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax = js.native
}

