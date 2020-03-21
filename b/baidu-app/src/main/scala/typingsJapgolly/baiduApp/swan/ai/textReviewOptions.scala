package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
		 * 自动化、智能化的文本审核。
		 */
trait textReviewOptions
  extends BaseOptions[js.Any, js.Any] {
  var content: String
   // 待审核文本，UTF-8，不可为空，不超过20000字节。
  @JSName("success")
  var success_textReviewOptions: js.UndefOr[js.Function1[/* res */ textReviewResponse, Unit]] = js.undefined
}

object textReviewOptions {
  @scala.inline
  def apply(
    content: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ textReviewResponse => Callback = null
  ): textReviewOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.textReviewResponse) => success(t0).runNow()))
    __obj.asInstanceOf[textReviewOptions]
  }
}

