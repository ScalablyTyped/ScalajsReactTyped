package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----录音
trait StartRecordAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 录音成功后调用，返回录音文件的临时文件路径，res = {tempFilePath: '录音文件的临时路径'} */
  @JSName("success")
  var success_StartRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
}

object StartRecordAudioOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ TempFileResponse => Callback = null
  ): StartRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.TempFileResponse) => success(t0).runNow()))
    __obj.asInstanceOf[StartRecordAudioOptions]
  }
}

