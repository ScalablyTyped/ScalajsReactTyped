package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
}

