package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonAuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openShareOptions
  extends BaseOptions[js.Any, js.Any] {
   // 分享标题
  var content: js.UndefOr[String] = js.undefined
   // 分享内容
  var imageUrl: js.UndefOr[String] = js.undefined
   // 分享图标
  var path: js.UndefOr[String] = js.undefined
   // 页面 path,必须是以 / 开头的完整路径。
  @JSName("success")
  var success_openShareOptions: js.UndefOr[js.Function1[/* res */ AnonAuthSetting, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object openShareOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    content: String = null,
    fail: js.Any => Callback = null,
    imageUrl: String = null,
    path: String = null,
    success: /* res */ AnonAuthSetting => Callback = null,
    title: String = null
  ): openShareOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonAuthSetting) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[openShareOptions]
  }
}

