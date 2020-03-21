package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax {
  def this(
    continueKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
}

