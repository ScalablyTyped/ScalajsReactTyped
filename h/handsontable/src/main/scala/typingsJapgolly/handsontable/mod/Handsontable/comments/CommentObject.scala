package typingsJapgolly.handsontable.mod.Handsontable.comments

import typingsJapgolly.handsontable.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentObject extends js.Object {
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[AnonHeight] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CommentObject {
  @scala.inline
  def apply(readOnly: js.UndefOr[Boolean] = js.undefined, style: AnonHeight = null, value: String = null): CommentObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentObject]
  }
}

