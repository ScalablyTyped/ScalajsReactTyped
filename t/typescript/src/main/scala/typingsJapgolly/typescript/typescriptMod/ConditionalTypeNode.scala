package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalTypeNode extends TypeNode {
  var checkType: TypeNode = js.native
  var extendsType: TypeNode = js.native
  var falseType: TypeNode = js.native
  @JSName("kind")
  var kind_ConditionalTypeNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConditionalType = js.native
  var trueType: TypeNode = js.native
}

