package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
@js.native
class ObjectCreationExpressionSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax {
  def this(
    newKeyword: ISyntaxToken,
    expression: IMemberExpressionSyntax,
    argumentList: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
}

