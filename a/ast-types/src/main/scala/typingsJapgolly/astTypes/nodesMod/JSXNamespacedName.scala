package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait JSXNamespacedName extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: JSXIdentifierKind
  var namespace: JSXIdentifierKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.JSXNamespacedName,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

