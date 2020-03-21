package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSEnumMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait TSEnumDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var const: Boolean
  var declare: Boolean
  var id: IdentifierKind
  var initializer: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var members: js.Array[TSEnumMemberKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    const: Boolean,
    declare: Boolean,
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSEnumDeclaration,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

