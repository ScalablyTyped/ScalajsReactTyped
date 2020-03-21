package typingsJapgolly.heredatalens.H.datalens.HeatmapLayer

import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.datalens.HeatmapLayer")
@js.native
object ^ extends js.Object {
  /**
    * Set of possible values for the aggregation option
    */
  var aggregation: Aggregation = js.native
  /**
    * Set of possible values for the inputScale option
    */
  var inputScale: InputScale = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(
    data: Data,
    x: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X,
    y: typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y,
    zoom: Zoom
  ): js.Array[Row] = js.native
}

