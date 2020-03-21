package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax {
  def this(
    propertyName: ISyntaxToken,
    colonToken: ISyntaxToken,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SimplePropertyAssignmentSyntax")
@js.native
object SimplePropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
}

