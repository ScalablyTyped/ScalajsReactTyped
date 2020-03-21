package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadVoiceConfig extends WxBaseRequestConfig {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: String
  /**
    * 下载成功回调
    */
  @JSName("success")
  def success_MDownloadVoiceConfig(res: js.Any): Unit
}

object DownloadVoiceConfig {
  @scala.inline
  def apply(
    serverId: String,
    success: js.Any => Callback,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    isShowProgressTips: Int | Double = null
  ): DownloadVoiceConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadVoiceConfig]
  }
}

