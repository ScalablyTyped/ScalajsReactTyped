package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLiteralExpression
  extends PrimaryExpression
     with ArrayBindingOrAssignmentPattern
     with AssignmentPattern
     with DestructuringPattern
     with _BindingOrAssignmentElement {
  var elements: NodeArray[Expression] = js.native
  @JSName("kind")
  var kind_ArrayLiteralExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrayLiteralExpression = js.native
}

