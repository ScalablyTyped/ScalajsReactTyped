package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax {
  def this(
    identifier: ISyntaxToken,
    colonToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "LabeledStatementSyntax")
@js.native
object LabeledStatementSyntax extends js.Object {
  def create1(identifier: ISyntaxToken, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
}

