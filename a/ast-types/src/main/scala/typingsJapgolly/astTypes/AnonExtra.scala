package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtra extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extra: js.UndefOr[AnonRawRawValue] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var raw: js.UndefOr[String | Null] = js.undefined
  var regex: js.UndefOr[AnonFlags | Null] = js.undefined
  var value: Double
}

object AnonExtra {
  @scala.inline
  def apply(
    value: Double,
    comments: js.Array[CommentKind] = null,
    extra: AnonRawRawValue = null,
    loc: SourceLocationKind = null,
    raw: String = null,
    regex: AnonFlags = null
  ): AnonExtra = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtra]
  }
}

