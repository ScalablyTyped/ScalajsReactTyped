package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 音乐位置，单位：秒 */
  var position: Double
}

object SeekBackgroundAudioOptions {
  @scala.inline
  def apply(
    position: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
}

