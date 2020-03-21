package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdownloadImage extends BaseParams {
   // 需要下载的图片的服务器端ID，由uploadImage接口获得
  var isShowProgressTips: Double
  var serverId: String
   // 默认为1，显示进度提示
  // 返回图片下载后的本地ID
  @JSName("success")
  def success_MIdownloadImage(res: Resouce): Unit
}

object IdownloadImage {
  @scala.inline
  def apply(
    isShowProgressTips: Double,
    serverId: String,
    success: Resouce => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IdownloadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.mod.Resouce) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IdownloadImage]
  }
}

