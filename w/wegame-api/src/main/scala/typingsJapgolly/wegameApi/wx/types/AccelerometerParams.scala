package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.game
import typingsJapgolly.wegameApi.wegameApiStrings.normal
import typingsJapgolly.wegameApi.wegameApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var interval: game | ui | normal
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AccelerometerParams {
  @scala.inline
  def apply(
    interval: game | ui | normal,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): AccelerometerParams = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[AccelerometerParams]
  }
}

