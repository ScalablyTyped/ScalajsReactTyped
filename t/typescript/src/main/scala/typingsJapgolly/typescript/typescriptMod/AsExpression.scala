package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsExpression
  extends Expression
     with AssertionExpression {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_AsExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsExpression = js.native
  var `type`: TypeNode = js.native
}

