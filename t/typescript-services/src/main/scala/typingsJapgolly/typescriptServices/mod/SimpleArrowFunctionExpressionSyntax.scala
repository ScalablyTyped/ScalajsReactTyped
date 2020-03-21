package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
class SimpleArrowFunctionExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax {
  def this(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
object SimpleArrowFunctionExpressionSyntax extends js.Object {
  def create(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
}

