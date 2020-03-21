package typingsJapgolly.heredatalens.H.datalens.RawDataProvider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class used in the worker thread
  * This helper class provides convenience functions you can use in the worker thread
  */
trait Helpers extends js.Object {
  /** Translates geographical coordinates (latitude, longitude) to world pixel coordinates. */
  var latLngToPixel: js.UndefOr[
    js.Function4[
      /* latitude */ Latitude, 
      /* longitude */ Longitude, 
      /* z */ Zoom, 
      /* tileSize */ TileSize, 
      PixelCoordinates
    ]
  ] = js.undefined
  /** Takes CSV data as input, parses it, and return the parsed result. */
  var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.undefined
  /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
  var pixelToLatLng: js.UndefOr[
    js.Function4[/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize, GeoCoordinates]
  ] = js.undefined
}

object Helpers {
  @scala.inline
  def apply(
    latLngToPixel: (/* latitude */ Latitude, /* longitude */ Longitude, /* z */ Zoom, /* tileSize */ TileSize) => CallbackTo[PixelCoordinates] = null,
    parseCSV: /* obj */ js.Any => CallbackTo[js.Array[js.Any]] = null,
    pixelToLatLng: (/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize) => CallbackTo[GeoCoordinates] = null
  ): Helpers = {
    val __obj = js.Dynamic.literal()
    if (latLngToPixel != null) __obj.updateDynamic("latLngToPixel")(js.Any.fromFunction4((t0: /* latitude */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.Latitude, t1: /* longitude */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.Longitude, t2: /* z */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t3: /* tileSize */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.TileSize) => latLngToPixel(t0, t1, t2, t3).runNow()))
    if (parseCSV != null) __obj.updateDynamic("parseCSV")(js.Any.fromFunction1((t0: /* obj */ js.Any) => parseCSV(t0).runNow()))
    if (pixelToLatLng != null) __obj.updateDynamic("pixelToLatLng")(js.Any.fromFunction4((t0: /* x */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.PX, t1: /* y */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.PY, t2: /* z */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t3: /* tileSize */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.TileSize) => pixelToLatLng(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Helpers]
  }
}

