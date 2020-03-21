package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait TSImportEqualsDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var isExport: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    id: IdentifierKind,
    isExport: Boolean,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSImportEqualsDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

