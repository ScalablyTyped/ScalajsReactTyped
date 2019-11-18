package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.KeyOfKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeOperator
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.UniqueKeyword
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

