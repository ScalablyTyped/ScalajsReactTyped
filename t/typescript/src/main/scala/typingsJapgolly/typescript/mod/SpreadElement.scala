package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElement
  extends Expression
     with _BindingOrAssignmentElement
     with _BindingOrAssignmentElementRestIndicator {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_SpreadElement: typingsJapgolly.typescript.mod.SyntaxKind.SpreadElement = js.native
  @JSName("parent")
  var parent_SpreadElement: ArrayLiteralExpression | CallExpression | NewExpression = js.native
}

