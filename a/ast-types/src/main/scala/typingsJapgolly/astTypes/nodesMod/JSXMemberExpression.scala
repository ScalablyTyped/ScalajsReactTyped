package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> */
trait JSXMemberExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `object`: JSXIdentifierKind | JSXMemberExpressionKind
  var property: JSXIdentifierKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.JSXMemberExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

