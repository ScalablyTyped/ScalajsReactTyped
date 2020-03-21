package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsExport extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var isExport: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
}

object AnonIsExport {
  @scala.inline
  def apply(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    comments: js.Array[CommentKind] = null,
    isExport: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): AnonIsExport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsExport]
  }
}

