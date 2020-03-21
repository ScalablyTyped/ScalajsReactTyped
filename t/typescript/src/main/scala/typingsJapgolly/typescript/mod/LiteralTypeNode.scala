package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralTypeNode extends TypeNode {
  @JSName("kind")
  var kind_LiteralTypeNode: typingsJapgolly.typescript.mod.SyntaxKind.LiteralType = js.native
  var literal: BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}

