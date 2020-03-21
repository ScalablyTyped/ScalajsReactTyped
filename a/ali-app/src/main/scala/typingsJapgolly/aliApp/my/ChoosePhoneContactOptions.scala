package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonMobile
import typingsJapgolly.aliApp.aliAppNumbers.`10`
import typingsJapgolly.aliApp.aliAppNumbers.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 联系人 https://docs.alipay.com/mini/api/ui-contact
trait ChoosePhoneContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChoosePhoneContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: AnonMobile): Unit
}

object ChoosePhoneContactOptions {
  @scala.inline
  def apply(
    success: AnonMobile => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: /* error */ `10` | `11` => Callback = null
  ): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonMobile) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.aliApp.aliAppNumbers.`10` | typingsJapgolly.aliApp.aliAppNumbers.`11`) => fail(t0).runNow()))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
}

