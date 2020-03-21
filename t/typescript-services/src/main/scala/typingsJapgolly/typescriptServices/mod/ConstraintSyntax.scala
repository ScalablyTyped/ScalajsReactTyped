package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstraintSyntax")
@js.native
class ConstraintSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax {
  def this(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "ConstraintSyntax")
@js.native
object ConstraintSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax = js.native
}

