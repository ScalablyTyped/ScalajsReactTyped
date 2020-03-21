package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeParameters: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
object TypeParameterListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
}

