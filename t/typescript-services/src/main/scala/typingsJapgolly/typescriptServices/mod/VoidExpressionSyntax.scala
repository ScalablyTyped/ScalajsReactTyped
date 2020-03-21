package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
class VoidExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax {
  def this(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
object VoidExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
}

