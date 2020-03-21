package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.album
import typingsJapgolly.wegameApi.wegameApiStrings.camera
import typingsJapgolly.wegameApi.wegameApiStrings.compressed
import typingsJapgolly.wegameApi.wegameApiStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeType extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var count: Double
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  var success: js.UndefOr[js.Function1[/* res */ AnonTempFilePaths, Unit]] = js.undefined
}

object AnonSizeType {
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]),
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonTempFilePaths => Callback = null
  ): AnonSizeType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonTempFilePaths) => success(t0).runNow()))
    __obj.asInstanceOf[AnonSizeType]
  }
}

