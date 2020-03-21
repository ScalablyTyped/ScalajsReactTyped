package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArrayTypeSyntax")
@js.native
class ArrayTypeSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax {
  def this(
    `type`: ITypeSyntax,
    openBracketToken: ISyntaxToken,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ArrayTypeSyntax")
@js.native
object ArrayTypeSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
}

