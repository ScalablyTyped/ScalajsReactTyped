package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseClause
  extends Node
     with CaseOrDefaultClause {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_CaseClause: typingsJapgolly.typescript.mod.SyntaxKind.CaseClause = js.native
  @JSName("parent")
  var parent_CaseClause: CaseBlock = js.native
  var statements: NodeArray[Statement] = js.native
}

