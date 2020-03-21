package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax {
  def this(
    typeArgumentList: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
object ArgumentListSyntax extends js.Object {
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax = js.native
}

