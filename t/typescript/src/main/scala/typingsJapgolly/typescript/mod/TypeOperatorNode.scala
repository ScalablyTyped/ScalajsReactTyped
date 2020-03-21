package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.TypeOperator
import typingsJapgolly.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOperatorNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_TypeOperatorNode: TypeOperator = js.native
  var operator: KeyOfKeyword | UniqueKeyword | ReadonlyKeyword = js.native
  var `type`: TypeNode = js.native
}

