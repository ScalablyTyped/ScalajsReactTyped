package typingsJapgolly.jestSnapshot

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var actual: String
  var expected: String | Null
  var name: String
  var pass: Boolean
  def message(): String
  def report(): String
}

object AnonName {
  @scala.inline
  def apply(
    actual: String,
    message: CallbackTo[String],
    name: String,
    pass: Boolean,
    report: CallbackTo[String],
    expected: String = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.updateDynamic("report")(report.toJsFn)
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

