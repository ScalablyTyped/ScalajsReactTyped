package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求检测图像中的主体位置。
		 */
trait DetectIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 如果检测主体是人，主体区域是否带上人脸部分，0-不带人脸区域，其他-带人脸区域，裁剪类需求推荐带人脸，检索/识别类需求推荐不带人脸。默认取1，带人脸。
  @JSName("success")
  var success_DetectIdentifyOptions: js.UndefOr[js.Function1[/* res */ DetectIdentifyResponse, Unit]] = js.undefined
   // 图像资源地址
  var with_face: js.UndefOr[Double] = js.undefined
}

object DetectIdentifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ DetectIdentifyResponse => Callback = null,
    with_face: Int | Double = null
  ): DetectIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ai.DetectIdentifyResponse) => success(t0).runNow()))
    if (with_face != null) __obj.updateDynamic("with_face")(with_face.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyOptions]
  }
}

