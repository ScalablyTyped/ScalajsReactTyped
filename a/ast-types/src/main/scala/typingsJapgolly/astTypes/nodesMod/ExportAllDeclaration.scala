package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ExportAllDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exported: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    source: LiteralKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ExportAllDeclaration,
    comments: js.Array[CommentKind] = null,
    exported: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (exported != null) __obj.updateDynamic("exported")(exported.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

