package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
		 */
trait GeneralIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图像资源地址
  @JSName("success")
  var success_GeneralIdentifyOptions: js.UndefOr[js.Function1[/* res */ GeneralIdentifyResponse, Unit]] = js.undefined
}

object GeneralIdentifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ GeneralIdentifyResponse => Callback = null
  ): GeneralIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.GeneralIdentifyResponse) => success(t0).runNow()))
    __obj.asInstanceOf[GeneralIdentifyOptions]
  }
}

