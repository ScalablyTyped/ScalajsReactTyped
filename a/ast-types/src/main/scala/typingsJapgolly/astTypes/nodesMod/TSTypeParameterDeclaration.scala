package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait TSTypeParameterDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[TSTypeParameterKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[TSTypeParameterKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypeParameterDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

