package typingsJapgolly.jshamcrest.JsHamcrest.Operators

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options accepted by assert().
  */
trait AssertOptions extends js.Object {
  var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
  var message: js.UndefOr[js.Any] = js.undefined
  var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
}

object AssertOptions {
  @scala.inline
  def apply(
    fail: /* description */ String => Callback = null,
    message: js.Any = null,
    pass: /* description */ String => Callback = null
  ): AssertOptions = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* description */ java.lang.String) => fail(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(js.Any.fromFunction1((t0: /* description */ java.lang.String) => pass(t0).runNow()))
    __obj.asInstanceOf[AssertOptions]
  }
}

