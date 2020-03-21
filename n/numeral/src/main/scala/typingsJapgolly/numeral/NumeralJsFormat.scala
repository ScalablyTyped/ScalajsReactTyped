package typingsJapgolly.numeral

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#custom-formats
trait NumeralJsFormat extends js.Object {
  var regexps: AnonFormat
  def format(value: js.Any, format: String, roundingFunction: RoundingFunction): String
  def unformat(value: String): Double
}

object NumeralJsFormat {
  @scala.inline
  def apply(
    format: (js.Any, String, RoundingFunction) => CallbackTo[String],
    regexps: AnonFormat,
    unformat: String => CallbackTo[Double]
  ): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(regexps = regexps.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.numeral.RoundingFunction) => format(t0, t1, t2).runNow()))
    __obj.updateDynamic("unformat")(js.Any.fromFunction1((t0: java.lang.String) => unformat(t0).runNow()))
    __obj.asInstanceOf[NumeralJsFormat]
  }
}

