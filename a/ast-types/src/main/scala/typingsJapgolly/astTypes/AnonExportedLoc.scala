package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExportedLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exported: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
}

object AnonExportedLoc {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.Array[CommentKind] = null,
    exported: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): AnonExportedLoc = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (exported != null) __obj.updateDynamic("exported")(exported.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExportedLoc]
  }
}

