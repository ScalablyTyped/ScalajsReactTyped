package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonTempImagePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ AnonTempImagePath, Unit]] = js.undefined
}

object TakePhotoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    quality: String = null,
    success: /* res */ AnonTempImagePath => Callback = null
  ): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonTempImagePath) => success(t0).runNow()))
    __obj.asInstanceOf[TakePhotoOptions]
  }
}

