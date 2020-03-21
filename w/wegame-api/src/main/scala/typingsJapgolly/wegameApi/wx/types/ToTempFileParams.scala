package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonTempFilePath
import typingsJapgolly.wegameApi.wegameApiStrings.jpg
import typingsJapgolly.wegameApi.wegameApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToTempFileParams extends ToTempFileSyncParams {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonTempFilePath, Unit]] = js.undefined
}

object ToTempFileParams {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fail: js.UndefOr[Callback] = js.undefined,
    fileType: jpg | png = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    success: /* res */ AnonTempFilePath => Callback = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ToTempFileParams = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonTempFilePath) => success(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFileParams]
  }
}

