package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesMetadata extends Object {
  /**
    * Indicates whether to provide a user-defined field description. See [Describe attribute fields](https://doc.arcgis.com/en/arcgis-online/manage-data/describe-fields.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}

object FeatureLayerCapabilitiesMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    supportsAdvancedFieldProperties: Boolean
  ): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
}

