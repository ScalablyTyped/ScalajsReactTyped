package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求识别身份证，身份证识别包括正面和背面。
		 */
trait ocrIdCardOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
   // front：身份证含照片的一面；back：身份证带国徽的一面。
  var detect_risk: js.UndefOr[Boolean] = js.undefined
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false: 不检测旋转角度，默认不检测。
  var id_card_side: js.UndefOr[String] = js.undefined
  var image: String
   // 是否开启身份证风险类型(身份证复印件、临时身份证、身份证翻拍、修改过的身份证)功能，默认不开启，即：false。可选值:true-开启；false-不开启。
  @JSName("success")
  var success_ocrIdCardOptions: js.UndefOr[js.Function1[/* res */ ocrIdCardResponse, Unit]] = js.undefined
}

object ocrIdCardOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Callback = null,
    detect_direction: js.UndefOr[Boolean] = js.undefined,
    detect_risk: js.UndefOr[Boolean] = js.undefined,
    fail: js.Any => Callback = null,
    id_card_side: String = null,
    success: /* res */ ocrIdCardResponse => Callback = null
  ): ocrIdCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (!js.isUndefined(detect_direction)) __obj.updateDynamic("detect_direction")(detect_direction.asInstanceOf[js.Any])
    if (!js.isUndefined(detect_risk)) __obj.updateDynamic("detect_risk")(detect_risk.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (id_card_side != null) __obj.updateDynamic("id_card_side")(id_card_side.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.ocrIdCardResponse) => success(t0).runNow()))
    __obj.asInstanceOf[ocrIdCardOptions]
  }
}

