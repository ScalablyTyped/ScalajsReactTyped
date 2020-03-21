package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ImportDeclarationSyntax")
@js.native
class ImportDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ImportDeclarationSyntax")
@js.native
object ImportDeclarationSyntax extends js.Object {
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
}

