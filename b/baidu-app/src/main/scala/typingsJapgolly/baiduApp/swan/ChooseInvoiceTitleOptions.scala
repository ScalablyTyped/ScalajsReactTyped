package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonBankAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region
trait ChooseInvoiceTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ AnonBankAccount, Unit]] = js.undefined
}

object ChooseInvoiceTitleOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonBankAccount => Callback = null
  ): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonBankAccount) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
}

