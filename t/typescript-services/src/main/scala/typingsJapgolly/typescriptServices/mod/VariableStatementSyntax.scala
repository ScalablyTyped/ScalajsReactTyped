package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  def create(
    variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax = js.native
  def create1(variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax): typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax = js.native
}

