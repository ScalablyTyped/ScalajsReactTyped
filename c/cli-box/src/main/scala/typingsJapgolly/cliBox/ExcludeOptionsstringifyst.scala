package typingsJapgolly.cliBox

import typingsJapgolly.cliBox.cliBoxBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<cli-box.cli-box.Options, 'stringify'> & {  stringify  :true} */
trait ExcludeOptionsstringifyst extends js.Object {
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var marks: js.UndefOr[PartialMarks] = js.undefined
  var stringify: js.UndefOr[Boolean with `true`] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ExcludeOptionsstringifyst {
  @scala.inline
  def apply(
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    h: Int | Double = null,
    height: Int | Double = null,
    marks: PartialMarks = null,
    stringify: js.UndefOr[Boolean with `true`] = js.undefined,
    w: Int | Double = null,
    width: Int | Double = null
  ): ExcludeOptionsstringifyst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeOptionsstringifyst]
  }
}

