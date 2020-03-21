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
trait ForInStatement extends ASTNode {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: VariableDeclarationKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ForInStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForInStatement]
  }
}

