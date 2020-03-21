package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilitiesExportMap extends Object {
  /**
    * Indicates if sublayers rendering can be modified or added using dynamic layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsDynamicLayers: Boolean
  /**
    * Indicates if sublayers [definition expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression) can be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerDefinitionExpression: Boolean
  /**
    * Indicates if sublayers [visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible) can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerVisibility: Boolean
  /**
    * Indicates if sublayers can be added, removed, or reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayersChanges: Boolean
}

object ArcGISMapServiceCapabilitiesExportMap {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    supportsDynamicLayers: Boolean,
    supportsSublayerDefinitionExpression: Boolean,
    supportsSublayerVisibility: Boolean,
    supportsSublayersChanges: Boolean
  ): ArcGISMapServiceCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], supportsDynamicLayers = supportsDynamicLayers.asInstanceOf[js.Any], supportsSublayerDefinitionExpression = supportsSublayerDefinitionExpression.asInstanceOf[js.Any], supportsSublayerVisibility = supportsSublayerVisibility.asInstanceOf[js.Any], supportsSublayersChanges = supportsSublayersChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportMap]
  }
}

