package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveImageToPhotosAlbumOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var filePath: String
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: AnonErrMsg): Unit
}

object SaveImageToPhotosAlbumOptions {
  @scala.inline
  def apply(
    filePath: String,
    success: AnonErrMsg => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.AnonErrMsg) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
}

