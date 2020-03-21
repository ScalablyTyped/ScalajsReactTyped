package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait ForStatement extends ASTNode {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var init: VariableDeclarationKind | ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind | Null
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ForStatement
  var update: ExpressionKind | Null
}

object ForStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ForStatement,
    comments: js.Array[CommentKind] = null,
    init: VariableDeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null,
    update: ExpressionKind = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
}

