package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseBlock extends Node {
  var clauses: NodeArray[CaseOrDefaultClause] = js.native
  @JSName("kind")
  var kind_CaseBlock: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaseBlock = js.native
  @JSName("parent")
  var parent_CaseBlock: SwitchStatement = js.native
}

