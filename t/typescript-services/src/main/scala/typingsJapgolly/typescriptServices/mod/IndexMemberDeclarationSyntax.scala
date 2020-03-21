package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax): typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}

