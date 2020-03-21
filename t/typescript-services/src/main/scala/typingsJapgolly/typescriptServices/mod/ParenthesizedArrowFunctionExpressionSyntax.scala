package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax {
  def this(
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
}

