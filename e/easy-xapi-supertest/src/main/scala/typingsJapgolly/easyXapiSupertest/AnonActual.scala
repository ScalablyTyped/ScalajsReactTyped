package typingsJapgolly.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActual extends js.Object {
  var actual: js.UndefOr[js.Any] = js.undefined
  var expected: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var stackStartFunction: js.UndefOr[js.Function] = js.undefined
}

object AnonActual {
  @scala.inline
  def apply(
    actual: js.Any = null,
    expected: js.Any = null,
    message: String = null,
    operator: String = null,
    stackStartFunction: js.Function = null
  ): AnonActual = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (stackStartFunction != null) __obj.updateDynamic("stackStartFunction")(stackStartFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActual]
  }
}

