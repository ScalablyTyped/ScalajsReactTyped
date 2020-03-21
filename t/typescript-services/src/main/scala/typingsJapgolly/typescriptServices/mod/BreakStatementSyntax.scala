package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
class BreakStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax {
  def this(
    breakKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
object BreakStatementSyntax extends js.Object {
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax = js.native
}

