package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultClause
  extends Node
     with CaseOrDefaultClause {
  @JSName("kind")
  var kind_DefaultClause: typingsJapgolly.typescript.mod.SyntaxKind.DefaultClause = js.native
  @JSName("parent")
  var parent_DefaultClause: CaseBlock = js.native
  var statements: NodeArray[Statement] = js.native
}

