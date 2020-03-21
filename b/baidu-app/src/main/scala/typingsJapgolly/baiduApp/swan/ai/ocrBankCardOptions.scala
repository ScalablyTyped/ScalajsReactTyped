package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 识别银行卡并返回卡号、发卡行和卡片类型。
		 */
trait ocrBankCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图片资源地址
  @JSName("success")
  var success_ocrBankCardOptions: js.UndefOr[js.Function1[/* res */ ocrBankCardResponse, Unit]] = js.undefined
}

object ocrBankCardOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ ocrBankCardResponse => Callback = null
  ): ocrBankCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.ocrBankCardResponse) => success(t0).runNow()))
    __obj.asInstanceOf[ocrBankCardOptions]
  }
}

