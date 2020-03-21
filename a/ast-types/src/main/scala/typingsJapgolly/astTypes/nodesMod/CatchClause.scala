package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait CatchClause extends ASTNode {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var guard: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var param: PatternKind | Null
  var `type`: typingsJapgolly.astTypes.astTypesStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.CatchClause,
    comments: js.Array[CommentKind] = null,
    guard: ExpressionKind = null,
    loc: SourceLocationKind = null,
    param: PatternKind = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (guard != null) __obj.updateDynamic("guard")(guard.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
}

