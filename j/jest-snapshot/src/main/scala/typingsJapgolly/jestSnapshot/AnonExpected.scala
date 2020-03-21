package typingsJapgolly.jestSnapshot

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpected extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.undefined
  var expected: js.UndefOr[scala.Nothing] = js.undefined
  var name: String
  var pass: Boolean
  def message(): String
  def report(): String
}

object AnonExpected {
  @scala.inline
  def apply(
    message: CallbackTo[String],
    name: String,
    pass: Boolean,
    report: CallbackTo[String],
    actual: js.UndefOr[scala.Nothing] = js.undefined,
    expected: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonExpected = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.updateDynamic("report")(report.toJsFn)
    if (!js.isUndefined(actual)) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpected]
  }
}

