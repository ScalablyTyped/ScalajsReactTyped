package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  var key: String
  @JSName("success")
  var success_RemoveStorageOptions: js.UndefOr[js.Function1[/* res */ DataResponse, Unit]] = js.undefined
}

object RemoveStorageOptions {
  @scala.inline
  def apply(
    key: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ DataResponse => Callback = null
  ): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.DataResponse) => success(t0).runNow()))
    __obj.asInstanceOf[RemoveStorageOptions]
  }
}

