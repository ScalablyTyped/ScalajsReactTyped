package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
object ForInStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax = js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax = js.native
}

