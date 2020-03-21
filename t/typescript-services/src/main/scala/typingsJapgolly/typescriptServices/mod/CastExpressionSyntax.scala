package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax = js.native
}

