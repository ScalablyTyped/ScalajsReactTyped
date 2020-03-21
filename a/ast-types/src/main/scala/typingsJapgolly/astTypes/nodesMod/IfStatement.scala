package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait IfStatement extends ASTNode {
  var alternate: StatementKind | Null
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var consequent: StatementKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.IfStatement,
    alternate: StatementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

