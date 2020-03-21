package typingsJapgolly.astTypes

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

trait AnonDeclaration extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
}

object AnonDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    comments: js.Array[CommentKind] = null,
    declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind] = null
  ): AnonDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclaration]
  }
}

