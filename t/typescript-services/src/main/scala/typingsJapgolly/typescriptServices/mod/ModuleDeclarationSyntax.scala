package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.INameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
class ModuleDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
object ModuleDeclarationSyntax extends js.Object {
  def create(moduleKeyword: ISyntaxToken, openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
}

