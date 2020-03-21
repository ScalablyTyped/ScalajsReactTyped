package typingsJapgolly.heredatalens.H.datalens.RawDataProvider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.ObjectLayer.Row
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Defines how the input data is mapped to an array of GeoJSON features */
  var dataToFeatures: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[Feature]]] = js.undefined
  /** The data url to fetch */
  var dataUrl: js.UndefOr[String] = js.undefined
  /** Defines how GeoJSON features on a tile should be mapped to data rows, which are inputs to layers such as ObjectLayer and HeatmapLayer */
  var featuresToRows: js.UndefOr[
    js.Function6[
      /* features */ js.Array[Feature], 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Zoom, 
      /* tileSize */ TileSize, 
      /* helpers */ Helpers, 
      js.Array[Row]
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataToFeatures: /* obj */ js.Any => CallbackTo[js.Array[Feature]] = null,
    dataUrl: String = null,
    featuresToRows: (/* features */ js.Array[Feature], /* x */ X, /* y */ Y, /* z */ Zoom, /* tileSize */ TileSize, /* helpers */ Helpers) => CallbackTo[js.Array[Row]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataToFeatures != null) __obj.updateDynamic("dataToFeatures")(js.Any.fromFunction1((t0: /* obj */ js.Any) => dataToFeatures(t0).runNow()))
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (featuresToRows != null) __obj.updateDynamic("featuresToRows")(js.Any.fromFunction6((t0: /* features */ js.Array[typingsJapgolly.heredatalens.H.datalens.RawDataProvider.Feature], t1: /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, t2: /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, t3: /* z */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t4: /* tileSize */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.TileSize, t5: /* helpers */ typingsJapgolly.heredatalens.H.datalens.RawDataProvider.Helpers) => featuresToRows(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[Options]
  }
}

