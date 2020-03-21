package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait compressImageOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片路径，图片的路径，可以是相对路径、临时文件路径、存储文件路径
  var quality: js.UndefOr[Double] = js.undefined
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var src: String
   // 默认值为80,压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）。
  @JSName("success")
  def success_McompressImageOptions(tempFilePath: String): Unit
}

object compressImageOptions {
  @scala.inline
  def apply(
    src: String,
    success: String => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    quality: Int | Double = null
  ): compressImageOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: java.lang.String) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[compressImageOptions]
  }
}

