package typingsJapgolly.leafletMousePosition.mod.Control_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.ControlOptions
import typingsJapgolly.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePositionControlOptions extends ControlOptions {
  var emptyString: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* lng */ Double, /* lat */ Double, String]] = js.undefined
  var latFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.undefined
  var lngFirst: js.UndefOr[Boolean] = js.undefined
  var lngFormatter: js.UndefOr[js.Function1[/* lng */ Double, String]] = js.undefined
  var numDigits: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var wrapLng: js.UndefOr[Boolean] = js.undefined
}

object MousePositionControlOptions {
  @scala.inline
  def apply(
    emptyString: String = null,
    formatter: (/* lng */ Double, /* lat */ Double) => CallbackTo[String] = null,
    latFormatter: /* lat */ Double => CallbackTo[String] = null,
    lngFirst: js.UndefOr[Boolean] = js.undefined,
    lngFormatter: /* lng */ Double => CallbackTo[String] = null,
    numDigits: Int | Double = null,
    position: ControlPosition = null,
    prefix: String = null,
    separator: String = null,
    wrapLng: js.UndefOr[Boolean] = js.undefined
  ): MousePositionControlOptions = {
    val __obj = js.Dynamic.literal()
    if (emptyString != null) __obj.updateDynamic("emptyString")(emptyString.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2((t0: /* lng */ scala.Double, t1: /* lat */ scala.Double) => formatter(t0, t1).runNow()))
    if (latFormatter != null) __obj.updateDynamic("latFormatter")(js.Any.fromFunction1((t0: /* lat */ scala.Double) => latFormatter(t0).runNow()))
    if (!js.isUndefined(lngFirst)) __obj.updateDynamic("lngFirst")(lngFirst.asInstanceOf[js.Any])
    if (lngFormatter != null) __obj.updateDynamic("lngFormatter")(js.Any.fromFunction1((t0: /* lng */ scala.Double) => lngFormatter(t0).runNow()))
    if (numDigits != null) __obj.updateDynamic("numDigits")(numDigits.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLng)) __obj.updateDynamic("wrapLng")(wrapLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[MousePositionControlOptions]
  }
}

