package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerCapabilitiesData extends Object {
  /**
    * Indicates if the attachment is enabled on the layer. At this current time, the GeoJSONLayer doesn’t support attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAttachment: Boolean
  /**
    * Indicates if the features in the layer support M values. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsM: Boolean
  /**
    * Indicates if the features in the layer support Z values. Requires ArcGIS Server service 10.1 or greater. See [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsZ: Boolean
}

object GeoJSONLayerCapabilitiesData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    supportsAttachment: Boolean,
    supportsM: Boolean,
    supportsZ: Boolean
  ): GeoJSONLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesData]
  }
}

