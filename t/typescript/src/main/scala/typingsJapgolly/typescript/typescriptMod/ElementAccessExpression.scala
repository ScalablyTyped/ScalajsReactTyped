package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with DeclarationName
     with _BindingOrAssignmentElement {
  var argumentExpression: Expression = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_ElementAccessExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ElementAccessExpression = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}

