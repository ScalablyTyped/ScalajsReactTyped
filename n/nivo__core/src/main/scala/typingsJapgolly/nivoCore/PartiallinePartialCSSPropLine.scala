package typingsJapgolly.nivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}> */
trait PartiallinePartialCSSPropLine extends js.Object {
  var line: js.UndefOr[PartialCSSProperties] = js.undefined
  var text: js.UndefOr[PartialCSSProperties] = js.undefined
}

object PartiallinePartialCSSPropLine {
  @scala.inline
  def apply(line: PartialCSSProperties = null, text: PartialCSSProperties = null): PartiallinePartialCSSPropLine = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallinePartialCSSPropLine]
  }
}

