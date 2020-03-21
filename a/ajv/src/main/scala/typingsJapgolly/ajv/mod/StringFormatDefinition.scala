package typingsJapgolly.ajv.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ajv.ajvStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormatDefinition extends FormatDefinition {
  var async: js.UndefOr[Boolean] = js.undefined
  var compare: js.UndefOr[js.Function2[/* data1 */ String, /* data2 */ String, Double]] = js.undefined
  var `type`: js.UndefOr[string] = js.undefined
  var validate: FormatValidator
}

object StringFormatDefinition {
  @scala.inline
  def apply(
    validate: FormatValidator,
    async: js.UndefOr[Boolean] = js.undefined,
    compare: (/* data1 */ String, /* data2 */ String) => CallbackTo[Double] = null,
    `type`: string = null
  ): StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: /* data1 */ java.lang.String, t1: /* data2 */ java.lang.String) => compare(t0, t1).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormatDefinition]
  }
}

