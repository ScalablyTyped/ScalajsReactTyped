package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsElementType extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elementType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsElementType {
  @scala.inline
  def apply(elementType: TSTypeKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonCommentsElementType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsElementType]
  }
}

