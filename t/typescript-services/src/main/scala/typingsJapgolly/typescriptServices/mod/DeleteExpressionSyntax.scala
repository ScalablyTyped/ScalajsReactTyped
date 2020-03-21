package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DeleteExpressionSyntax")
@js.native
class DeleteExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax {
  def this(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "DeleteExpressionSyntax")
@js.native
object DeleteExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax = js.native
}

