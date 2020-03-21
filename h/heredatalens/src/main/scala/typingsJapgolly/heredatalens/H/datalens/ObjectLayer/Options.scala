package typingsJapgolly.heredatalens.H.datalens.ObjectLayer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import typingsJapgolly.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and data-driven styling for ObjectLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with ObjectLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  * In the next step each row must be presented as a map object with the rowToMapObject callback. Data-driven styling can be provided with the rowToStyle callback.
  */
trait Options extends js.Object {
  /** When present, client-side clustering is applied */
  var clustering: js.UndefOr[Clustering] = js.undefined
  /** Defines quantization of data for improving data-driven styling performance */
  var dataDomains: js.UndefOr[DataDomains] = js.undefined
  /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
  var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.undefined
  /**
    * Defines map object style and icon according to data row and zoom level.
    * Also it can define different styles depending on the StyleState (eg hovered, selected).
    */
  var rowToStyle: js.UndefOr[
    js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
  ] = js.undefined
  /** Defines how each row is presented on the map (eg marker, polygon) */
  def rowToMapObject(row: Row, z: Zoom): Object
}

object Options {
  @scala.inline
  def apply(
    rowToMapObject: (Row, Zoom) => CallbackTo[Object],
    clustering: Clustering = null,
    dataDomains: DataDomains = null,
    dataToRows: /* data */ Data => CallbackTo[js.Array[Row]] = null,
    rowToStyle: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => CallbackTo[ObjectStyleOptions] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowToMapObject")(js.Any.fromFunction2((t0: typingsJapgolly.heredatalens.H.datalens.ObjectLayer.Row, t1: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => rowToMapObject(t0, t1).runNow()))
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (dataDomains != null) __obj.updateDynamic("dataDomains")(dataDomains.asInstanceOf[js.Any])
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.heredatalens.H.datalens.Service.Data) => dataToRows(t0).runNow()))
    if (rowToStyle != null) __obj.updateDynamic("rowToStyle")(js.Any.fromFunction3((t0: /* row */ typingsJapgolly.heredatalens.H.datalens.ObjectLayer.Row, t1: /* z */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t2: /* styleState */ typingsJapgolly.heredatalens.H.datalens.ObjectLayer.StyleState) => rowToStyle(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

