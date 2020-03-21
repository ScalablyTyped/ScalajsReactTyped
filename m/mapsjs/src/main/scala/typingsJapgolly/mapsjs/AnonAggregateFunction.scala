package typingsJapgolly.mapsjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregateFunction extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, Unit]
  ] = js.undefined
  var data: js.Array[js.Object]
  var mapUnitsPerPixel: Double
  var marginPixels: js.UndefOr[Double] = js.undefined
  var pointKey: String
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, Double]] = js.undefined
  def radiusFunction(row: js.Any): Double
}

object AnonAggregateFunction {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: Double,
    pointKey: String,
    radiusFunction: js.Any => CallbackTo[Double],
    aggregateFunction: (/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any) => Callback = null,
    marginPixels: Int | Double = null,
    valueFunction: /* row */ js.Any => CallbackTo[Double] = null
  ): AnonAggregateFunction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], pointKey = pointKey.asInstanceOf[js.Any])
    __obj.updateDynamic("radiusFunction")(js.Any.fromFunction1((t0: js.Any) => radiusFunction(t0).runNow()))
    if (aggregateFunction != null) __obj.updateDynamic("aggregateFunction")(js.Any.fromFunction3((t0: /* srcRow */ js.Any, t1: /* cmpRow */ js.Any, t2: /* aggRow */ js.Any) => aggregateFunction(t0, t1, t2).runNow()))
    if (marginPixels != null) __obj.updateDynamic("marginPixels")(marginPixels.asInstanceOf[js.Any])
    if (valueFunction != null) __obj.updateDynamic("valueFunction")(js.Any.fromFunction1((t0: /* row */ js.Any) => valueFunction(t0).runNow()))
    __obj.asInstanceOf[AnonAggregateFunction]
  }
}

