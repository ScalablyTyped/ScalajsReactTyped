package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeArguments: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
object TypeArgumentListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
}

