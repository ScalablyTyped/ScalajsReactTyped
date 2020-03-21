package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkDt.AnonLocalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalImgDataConfig extends WxBaseRequestConfig {
  /**
    * 图片的 localID
    */
  var localId: String
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: AnonLocalData): Unit
}

object GetLocalImgDataConfig {
  @scala.inline
  def apply(
    localId: String,
    success: AnonLocalData => Callback,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null
  ): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.wxJsSdkDt.AnonLocalData) => success(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
}

