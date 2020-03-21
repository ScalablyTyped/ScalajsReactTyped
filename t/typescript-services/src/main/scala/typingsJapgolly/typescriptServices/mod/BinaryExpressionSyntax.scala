package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BinaryExpressionSyntax")
@js.native
class BinaryExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax {
  def this(
    kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
    left: IExpressionSyntax,
    operatorToken: ISyntaxToken,
    right: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

