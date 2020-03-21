package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonCityName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----收货地址
trait ChooseAddressOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseAddressOptions: js.UndefOr[js.Function1[/* res */ AnonCityName, Unit]] = js.undefined
}

object ChooseAddressOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonCityName => Callback = null
  ): ChooseAddressOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonCityName) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseAddressOptions]
  }
}

