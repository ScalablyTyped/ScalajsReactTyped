package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkDt.AnonLocalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownLoadImageConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: String
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  @JSName("success")
  var success_DownLoadImageConfig: js.UndefOr[js.Function1[/* res */ AnonLocalId, Unit]] = js.undefined
}

object DownLoadImageConfig {
  @scala.inline
  def apply(
    serverId: String,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    isShowProgressTips: Int | Double = null,
    success: /* res */ AnonLocalId => Callback = null
  ): DownLoadImageConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wxJsSdkDt.AnonLocalId) => success(t0).runNow()))
    __obj.asInstanceOf[DownLoadImageConfig]
  }
}

