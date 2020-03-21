package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
object InterfaceDeclarationSyntax extends js.Object {
  def create(
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    body: typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
}

