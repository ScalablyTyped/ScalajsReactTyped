package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBackgroundAudioOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /** 音乐链接 */
  var dataUrl: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}

object PlayBackgroundAudioOptions {
  @scala.inline
  def apply(
    dataUrl: String,
    complete: /* res */ js.Any => Callback = null,
    coverImgUrl: String = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null,
    title: String = null
  ): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
}

