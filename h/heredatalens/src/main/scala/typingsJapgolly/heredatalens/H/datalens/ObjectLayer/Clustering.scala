package typingsJapgolly.heredatalens.H.datalens.ObjectLayer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heremaps.H.clustering.DataPoint
import typingsJapgolly.heremaps.H.clustering.Provider.ClusteringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines client-side clustering in the ObjectLayer.
  * When the clustering option is provided, rows returned from dataToRows go to the clustering.rowToDataPoint callback to be transformed to data points.
  * Then, the data points are clustered according to clustering.options. Clustering produces clusters and noise points (data points that are not clustered).
  * Clusters and noise points must be presented as map objects with the rowToMapObject callback and can be styled with the rowToStyle callback.
  */
trait Clustering extends js.Object {
  /** Defines clustering options as a function of the zoom level */
  def options(zoom: Zoom): ClusteringOptions
  /** Defines data points from rows */
  def rowToDataPoint(row: Row): DataPoint
}

object Clustering {
  @scala.inline
  def apply(options: Zoom => CallbackTo[ClusteringOptions], rowToDataPoint: Row => CallbackTo[DataPoint]): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(js.Any.fromFunction1((t0: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => options(t0).runNow()))
    __obj.updateDynamic("rowToDataPoint")(js.Any.fromFunction1((t0: typingsJapgolly.heredatalens.H.datalens.ObjectLayer.Row) => rowToDataPoint(t0).runNow()))
    __obj.asInstanceOf[Clustering]
  }
}

