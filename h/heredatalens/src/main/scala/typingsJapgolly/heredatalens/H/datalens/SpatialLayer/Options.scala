package typingsJapgolly.heredatalens.H.datalens.SpatialLayer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for SpatialLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with SpatialLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  */
trait Options extends js.Object {
  /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
  var dataToRows: js.UndefOr[js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom, js.Array[Row]]] = js.undefined
  /** Defines how to transform the features. */
  var transformFeature: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.transformFeature
  /** Defines the default map object style. */
  def defaultStyle(z: Zoom, styleState: StyleState): js.Any
  /** Defines how to get the spatial ID from a geometry feature. This callback is called for each geometry feature in the vector tile. */
  def featureToSpatialId(feature: Feature): String
  /** Defines how to get the spatial ID from a data row. This callback is called for each row that is returned from dataToRows. */
  def rowToSpatialId(row: Row): String
  /** Defines how the row is translated to map object style. This callback is called for each row that is returned from dataToRows. */
  def rowToStyle(row: Row, z: Zoom, styleState: StyleState): js.Any
}

object Options {
  @scala.inline
  def apply(
    defaultStyle: (Zoom, StyleState) => CallbackTo[js.Any],
    featureToSpatialId: Feature => CallbackTo[String],
    rowToSpatialId: Row => CallbackTo[String],
    rowToStyle: (Row, Zoom, StyleState) => CallbackTo[js.Any],
    transformFeature: transformFeature,
    dataToRows: (/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom) => CallbackTo[js.Array[Row]] = null
  ): Options = {
    val __obj = js.Dynamic.literal(transformFeature = transformFeature.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultStyle")(js.Any.fromFunction2((t0: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t1: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.StyleState) => defaultStyle(t0, t1).runNow()))
    __obj.updateDynamic("featureToSpatialId")(js.Any.fromFunction1((t0: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.Feature) => featureToSpatialId(t0).runNow()))
    __obj.updateDynamic("rowToSpatialId")(js.Any.fromFunction1((t0: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.Row) => rowToSpatialId(t0).runNow()))
    __obj.updateDynamic("rowToStyle")(js.Any.fromFunction3((t0: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.Row, t1: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom, t2: typingsJapgolly.heredatalens.H.datalens.SpatialLayer.StyleState) => rowToStyle(t0, t1, t2).runNow()))
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction4((t0: /* data */ typingsJapgolly.heredatalens.H.datalens.Service.Data, t1: /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, t2: /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, t3: /* z */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => dataToRows(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Options]
  }
}

