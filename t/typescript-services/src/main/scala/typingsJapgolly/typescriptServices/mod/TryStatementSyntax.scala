package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    catchClause: typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax,
    finallyClause: typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax): typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax = js.native
}

