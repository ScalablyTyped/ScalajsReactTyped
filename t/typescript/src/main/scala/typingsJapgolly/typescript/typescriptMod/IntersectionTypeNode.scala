package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  @JSName("kind")
  var kind_IntersectionTypeNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IntersectionType = js.native
  var types: NodeArray[TypeNode] = js.native
}

