package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
object MemberFunctionDeclarationSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}

