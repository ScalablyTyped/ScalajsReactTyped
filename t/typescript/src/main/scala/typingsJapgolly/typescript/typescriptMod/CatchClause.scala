package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClause extends Node {
  var block: Block = js.native
  @JSName("kind")
  var kind_CatchClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CatchClause = js.native
  @JSName("parent")
  var parent_CatchClause: TryStatement = js.native
  var variableDeclaration: js.UndefOr[VariableDeclaration] = js.native
}

