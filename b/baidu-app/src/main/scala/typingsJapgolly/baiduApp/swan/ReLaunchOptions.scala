package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReLaunchOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要跳转的应用内页面路径 , 路径后可以带参数。
  		 * 参数与路径之间使用?分隔，参数键与参数值用=相连，不同参数用&分隔
  		 * 如 'path?key=value&key2=value2'，如果跳转的页面路径是 tabBar 页面则不能带参数
  		 */
  var url: String
}

object ReLaunchOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): ReLaunchOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ReLaunchOptions]
  }
}

