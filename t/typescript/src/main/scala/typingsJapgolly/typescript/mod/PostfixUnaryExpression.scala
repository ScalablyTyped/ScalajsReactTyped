package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostfixUnaryExpression extends UpdateExpression {
  @JSName("kind")
  var kind_PostfixUnaryExpression: typingsJapgolly.typescript.mod.SyntaxKind.PostfixUnaryExpression = js.native
  var operand: LeftHandSideExpression = js.native
  var operator: PostfixUnaryOperator = js.native
}

