package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerCapabilities extends Object {
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var data: CSVLayerCapabilitiesData
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var editing: CSVLayerCapabilitiesEditing
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var operations: CSVLayerCapabilitiesOperations
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var query: CSVLayerCapabilitiesQuery
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var queryRelated: CSVLayerCapabilitiesQueryRelated
}

object CSVLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: CSVLayerCapabilitiesData,
    editing: CSVLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    operations: CSVLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    query: CSVLayerCapabilitiesQuery,
    queryRelated: CSVLayerCapabilitiesQueryRelated
  ): CSVLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[CSVLayerCapabilities]
  }
}

