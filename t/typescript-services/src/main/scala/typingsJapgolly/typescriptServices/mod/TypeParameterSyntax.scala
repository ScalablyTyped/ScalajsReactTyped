package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
class TypeParameterSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax {
  def this(
    identifier: ISyntaxToken,
    constraint: typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax = js.native
}

