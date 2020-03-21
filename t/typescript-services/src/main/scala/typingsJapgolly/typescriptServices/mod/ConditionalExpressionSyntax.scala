package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConditionalExpressionSyntax")
@js.native
class ConditionalExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax {
  def this(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConditionalExpressionSyntax")
@js.native
object ConditionalExpressionSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, whenTrue: IExpressionSyntax, whenFalse: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
}

