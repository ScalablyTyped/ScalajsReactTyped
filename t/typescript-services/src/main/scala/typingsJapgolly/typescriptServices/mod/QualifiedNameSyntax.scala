package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.INameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "QualifiedNameSyntax")
@js.native
object QualifiedNameSyntax extends js.Object {
  def create1(left: INameSyntax, right: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
}

