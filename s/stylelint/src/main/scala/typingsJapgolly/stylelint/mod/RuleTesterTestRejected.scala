package typingsJapgolly.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterTestRejected extends RuleTesterTest {
  var column: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var only: js.UndefOr[Boolean] = js.undefined
}

object RuleTesterTestRejected {
  @scala.inline
  def apply(
    code: String,
    column: Int | Double = null,
    description: String = null,
    line: Int | Double = null,
    message: String = null,
    only: js.UndefOr[Boolean] = js.undefined
  ): RuleTesterTestRejected = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterTestRejected]
  }
}

