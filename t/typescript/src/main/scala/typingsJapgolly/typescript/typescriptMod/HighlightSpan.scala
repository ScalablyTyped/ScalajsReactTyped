package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSpan extends js.Object {
  var contextSpan: js.UndefOr[TextSpan] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var isInString: js.UndefOr[`true`] = js.undefined
  var kind: HighlightSpanKind
  var textSpan: TextSpan
}

object HighlightSpan {
  @scala.inline
  def apply(
    kind: HighlightSpanKind,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    fileName: String = null,
    isInString: `true` = null
  ): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (isInString != null) __obj.updateDynamic("isInString")(isInString.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSpan]
  }
}

