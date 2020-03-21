package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /** 音乐链接 */
  var dataUrl: String
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}

object PlayBackgroundAudioOptions {
  @scala.inline
  def apply(
    dataUrl: String,
    complete: /* res */ js.Any => Callback = null,
    coverImgUrl: String = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null,
    title: String = null
  ): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
}

