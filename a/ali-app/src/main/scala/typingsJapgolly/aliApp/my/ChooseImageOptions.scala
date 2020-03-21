package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 最大可选照片数，默认1张 */
  var count: Double
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType]
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: AnonApFilePaths): Unit
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    count: Double,
    sourceType: js.Array[ImageSourceType],
    success: AnonApFilePaths => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonApFilePaths) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

