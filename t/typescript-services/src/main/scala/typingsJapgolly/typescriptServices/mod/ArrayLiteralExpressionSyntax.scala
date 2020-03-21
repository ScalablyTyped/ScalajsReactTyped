package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArrayLiteralExpressionSyntax")
@js.native
class ArrayLiteralExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    expressions: ISeparatedSyntaxList,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ArrayLiteralExpressionSyntax")
@js.native
object ArrayLiteralExpressionSyntax extends js.Object {
  def create(openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
}

