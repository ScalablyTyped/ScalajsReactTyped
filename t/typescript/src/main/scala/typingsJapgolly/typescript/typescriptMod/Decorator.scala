package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator
  extends Node
     with CallLikeExpression {
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_Decorator: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Decorator = js.native
  @JSName("parent")
  var parent_Decorator: NamedDeclaration = js.native
}

