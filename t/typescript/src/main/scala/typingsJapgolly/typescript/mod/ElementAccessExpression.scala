package typingsJapgolly.typescript.mod

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
  var kind_ElementAccessExpression: typingsJapgolly.typescript.mod.SyntaxKind.ElementAccessExpression = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}

