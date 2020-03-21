package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonShareTickets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----分享
trait ShareAppMessage
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 分享描述, 默认为当前小程序名称
  		 */
  var desc: js.UndefOr[String] = js.undefined
  /**
  		 * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径，支持PNG及JPG
  		 * 不传入 imageUrl 则使用默认截图。显示图片长宽比是 5:4
  		 * @version 1.5.0
  		 */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
  		 * 分享路径  当默认为前页面 path ，
  		 * 必须是以 / 开头的完整路径
  		 *
  		 */
  var path: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_ShareAppMessage: js.UndefOr[js.Function1[/* res */ AnonShareTickets, Unit]] = js.undefined
  /**
  		 * 分享标题  默认为当前小程序名称
  		 *
  		 */
  var title: js.UndefOr[String] = js.undefined
}

object ShareAppMessage {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    desc: String = null,
    fail: js.Any => Callback = null,
    imageUrl: String = null,
    path: String = null,
    success: /* res */ AnonShareTickets => Callback = null,
    title: String = null
  ): ShareAppMessage = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonShareTickets) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAppMessage]
  }
}

