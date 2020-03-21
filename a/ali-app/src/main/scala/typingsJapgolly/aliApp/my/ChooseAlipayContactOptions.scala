package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonAvatar
import typingsJapgolly.aliApp.aliAppNumbers.`10`
import typingsJapgolly.aliApp.aliAppNumbers.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: AnonAvatar): Unit
}

object ChooseAlipayContactOptions {
  @scala.inline
  def apply(
    count: Double,
    success: AnonAvatar => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: /* error */ `10` | `11` => Callback = null
  ): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonAvatar) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.aliApp.aliAppNumbers.`10` | typingsJapgolly.aliApp.aliAppNumbers.`11`) => fail(t0).runNow()))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
}

