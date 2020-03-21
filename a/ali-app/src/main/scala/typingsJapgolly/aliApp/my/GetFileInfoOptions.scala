package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.md5
import typingsJapgolly.aliApp.aliAppStrings.sha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: String
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[md5 | sha1] = js.undefined
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.undefined
}

object GetFileInfoOptions {
  @scala.inline
  def apply(
    apFilePath: String,
    complete: /* res */ js.Any => Callback = null,
    digestAlgorithm: md5 | sha1 = null,
    fail: js.Any => Callback = null,
    success: /* options */ GetFileInfoSuccess => Callback = null
  ): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.aliApp.my.GetFileInfoSuccess) => success(t0).runNow()))
    __obj.asInstanceOf[GetFileInfoOptions]
  }
}

