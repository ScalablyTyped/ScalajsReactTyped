package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ElseClauseSyntax")
@js.native
class ElseClauseSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax {
  def this(elseKeyword: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "ElseClauseSyntax")
@js.native
object ElseClauseSyntax extends js.Object {
  def create1(statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax = js.native
}

