package typingsJapgolly.heremaps.H.map.provider.MarkerTileProvider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.map.AbstractMarker
import typingsJapgolly.heremaps.H.util.ICancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the MarkerTileProvider object.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property requestData {function(number, number, number, function(Array<H.map.AbstractMarker>), Function): H.util.ICancelable} - function that fetches marker data and creates array
  * of H.map.AbstractMarker that is passed success callback, if function fails to fetch data onError callback must be called
  * @property providesDomMarkers {boolean=} - indicates if markers provided are of type H.map.DomMarker or H.map.Marker, default is H.map.Marker
  */
trait Options extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var providesDomMarkers: js.UndefOr[Boolean] = js.undefined
  def requestData(
    n1: Double,
    n2: Double,
    n3: Double,
    markerCallback: js.Function1[/* markers */ js.Array[AbstractMarker], Unit],
    f: js.Function0[Unit]
  ): ICancelable
}

object Options {
  @scala.inline
  def apply(
    requestData: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => CallbackTo[ICancelable],
    max: Int | Double = null,
    min: Int | Double = null,
    providesDomMarkers: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestData")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Function1[/* markers */ js.Array[typingsJapgolly.heremaps.H.map.AbstractMarker], scala.Unit], t4: js.Function0[scala.Unit]) => requestData(t0, t1, t2, t3, t4).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(providesDomMarkers)) __obj.updateDynamic("providesDomMarkers")(providesDomMarkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

