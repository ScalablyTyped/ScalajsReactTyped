package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioPlayerStateOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  @JSName("complete")
  var complete_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  @JSName("fail")
  var fail_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function1[/* state */ BackgroundAudioPlayerState, Unit]] = js.undefined
}

object GetBackgroundAudioPlayerStateOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* state */ BackgroundAudioPlayerState => Callback = null
  ): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.baiduApp.swan.BackgroundAudioPlayerState) => success(t0).runNow()))
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
}

