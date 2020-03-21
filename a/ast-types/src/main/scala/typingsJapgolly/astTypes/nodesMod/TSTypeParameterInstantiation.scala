package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait TSTypeParameterInstantiation extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[TSTypeKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypeParameterInstantiation
}

object TSTypeParameterInstantiation {
  @scala.inline
  def apply(
    params: js.Array[TSTypeKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypeParameterInstantiation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterInstantiation]
  }
}

