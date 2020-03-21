package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(
    variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
}

