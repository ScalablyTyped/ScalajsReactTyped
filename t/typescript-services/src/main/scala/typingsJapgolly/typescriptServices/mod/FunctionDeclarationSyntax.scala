package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
object FunctionDeclarationSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
}

