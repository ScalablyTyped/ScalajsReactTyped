package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclareClassKind
import typingsJapgolly.astTypes.kindsMod.DeclareFunctionKind
import typingsJapgolly.astTypes.kindsMod.DeclareVariableKind
import typingsJapgolly.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsJapgolly.astTypes.kindsMod.ExportSpecifierKind
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait DeclareExportDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.DeclareExportDeclaration
}

object DeclareExportDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.DeclareExportDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportDeclaration]
  }
}

