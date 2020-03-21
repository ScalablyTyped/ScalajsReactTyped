package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`query-table`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipatch
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTableDataSource extends Object {
  /**
    * The geometry type of each record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch
  /**
    * The field name(s) containing the unique IDs for each record in the table. This can be a comma separated list if the query table is used in a [JoinTableDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinDataTableSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var oidFields: String
  /**
    * The SQL query used to filter records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var query: String
  /**
    * The spatial reference of the geometry of each feature in the table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var spatialReference: SpatialReference
  /**
    * This value is always `query-table` and is inferred when the `query` property of this object is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var `type`: `query-table`
  /**
    * The workspace where the data resides (defined in ArcGIS Server Manager).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var workspaceId: String
}

object QueryTableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | multipatch,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    oidFields: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    query: String,
    spatialReference: SpatialReference,
    `type`: `query-table`,
    workspaceId: String
  ): QueryTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], oidFields = oidFields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTableDataSource]
  }
}

