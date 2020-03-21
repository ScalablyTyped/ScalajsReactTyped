package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExportSpecifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ExportNamedDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declaration: DeclarationKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifierKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ExportNamedDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclarationKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

