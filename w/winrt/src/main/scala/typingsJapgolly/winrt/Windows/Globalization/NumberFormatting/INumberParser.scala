package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberParser extends js.Object {
  def parseDouble(text: String): Double
  def parseInt(text: String): Double
  def parseUInt(text: String): Double
}

object INumberParser {
  @scala.inline
  def apply(
    parseDouble: String => CallbackTo[Double],
    parseInt: String => CallbackTo[Double],
    parseUInt: String => CallbackTo[Double]
  ): INumberParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseDouble")(js.Any.fromFunction1((t0: java.lang.String) => parseDouble(t0).runNow()))
    __obj.updateDynamic("parseInt")(js.Any.fromFunction1((t0: java.lang.String) => parseInt(t0).runNow()))
    __obj.updateDynamic("parseUInt")(js.Any.fromFunction1((t0: java.lang.String) => parseUInt(t0).runNow()))
    __obj.asInstanceOf[INumberParser]
  }
}

