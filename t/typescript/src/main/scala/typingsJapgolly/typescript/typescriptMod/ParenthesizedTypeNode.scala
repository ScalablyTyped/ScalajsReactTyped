package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ParenthesizedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedTypeNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_ParenthesizedTypeNode: ParenthesizedType = js.native
  var `type`: TypeNode = js.native
}

