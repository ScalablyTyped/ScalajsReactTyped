package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的植物信息
		 */
trait plantClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图像资源地址
  @JSName("success")
  var success_plantClassifyOptions: js.UndefOr[js.Function1[/* res */ plantClassifyResponse, Unit]] = js.undefined
}

object plantClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ plantClassifyResponse => Callback = null
  ): plantClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.plantClassifyResponse) => success(t0).runNow()))
    __obj.asInstanceOf[plantClassifyOptions]
  }
}

