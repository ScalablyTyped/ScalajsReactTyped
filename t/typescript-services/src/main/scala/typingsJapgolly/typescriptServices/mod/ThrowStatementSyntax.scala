package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
object ThrowStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
}

