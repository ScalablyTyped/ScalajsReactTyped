package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonLineHeight
import typingsJapgolly.wegameApi.wegameApiStrings.bold
import typingsJapgolly.wegameApi.wegameApiStrings.italic
import typingsJapgolly.wegameApi.wegameApiStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fontFamily: String
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[normal | bold] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonLineHeight, Unit]] = js.undefined
  var text: String
}

object LineHeightParams {
  @scala.inline
  def apply(
    fontFamily: String,
    text: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    fontSize: Int | Double = null,
    fontStyle: normal | italic = null,
    fontWeight: normal | bold = null,
    success: /* res */ AnonLineHeight => Callback = null
  ): LineHeightParams = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonLineHeight) => success(t0).runNow()))
    __obj.asInstanceOf[LineHeightParams]
  }
}

