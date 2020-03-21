package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonFail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRiskIdentificationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要进行风险识别的文本内容
  		 */
  var content: String
  @JSName("success")
  var success_TextRiskIdentificationOptions: js.UndefOr[js.Function1[/* res */ AnonFail, Unit]] = js.undefined
  /**
  		 * 识别类型：keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
  		 */
  var `type`: js.Array[TextRiskIdentificationType]
}

object TextRiskIdentificationOptions {
  @scala.inline
  def apply(
    content: String,
    `type`: js.Array[TextRiskIdentificationType],
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonFail => Callback = null
  ): TextRiskIdentificationOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonFail) => success(t0).runNow()))
    __obj.asInstanceOf[TextRiskIdentificationOptions]
  }
}

