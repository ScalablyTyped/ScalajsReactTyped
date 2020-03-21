package typingsJapgolly.johnnyFive.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThermometerOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var freq: js.UndefOr[Double] = js.undefined
  var pin: String | Double
  var toCelsius: js.UndefOr[js.Function1[/* val */ Double, Double]] = js.undefined
}

object ThermometerOption {
  @scala.inline
  def apply(
    pin: String | Double,
    controller: String = null,
    freq: Int | Double = null,
    toCelsius: /* val */ Double => CallbackTo[Double] = null
  ): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (toCelsius != null) __obj.updateDynamic("toCelsius")(js.Any.fromFunction1((t0: /* val */ scala.Double) => toCelsius(t0).runNow()))
    __obj.asInstanceOf[ThermometerOption]
  }
}

