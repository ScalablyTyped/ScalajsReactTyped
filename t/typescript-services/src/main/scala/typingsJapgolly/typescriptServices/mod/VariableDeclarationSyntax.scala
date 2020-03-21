package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
class VariableDeclarationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax {
  def this(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
object VariableDeclarationSyntax extends js.Object {
  def create1(variableDeclarators: ISeparatedSyntaxList): typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
}

