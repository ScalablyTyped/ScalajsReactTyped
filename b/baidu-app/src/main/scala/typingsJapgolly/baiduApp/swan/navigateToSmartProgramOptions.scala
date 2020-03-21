package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *  打开另一个小程序。(参数)
	 */
trait navigateToSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要打开的小程序App Key
  		 */
  var appKey: String
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()
  		 * App.onShow() 中获取到这份数据。
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
  		 * 打开的页面路径，如果为空则打开首页 。
  		 */
  var path: js.UndefOr[String] = js.undefined
}

object navigateToSmartProgramOptions {
  @scala.inline
  def apply(
    appKey: String,
    complete: /* res */ js.Any => Callback = null,
    extraData: js.Any = null,
    fail: js.Any => Callback = null,
    path: String = null,
    success: js.Any => Callback = null
  ): navigateToSmartProgramOptions = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[navigateToSmartProgramOptions]
  }
}

