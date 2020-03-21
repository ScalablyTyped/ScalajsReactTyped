package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromArcGISServerUrlParams extends Object {
  /**
    * Set any of the layer's properties here for constructing the layer instance (e.g. popupTemplate, renderer, etc.).
    *
    * [Read more...](properties.html)
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * The ArcGIS Server URL used to create the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  var url: String
}

object LayerFromArcGISServerUrlParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    url: String,
    properties: js.Any = null
  ): LayerFromArcGISServerUrlParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerFromArcGISServerUrlParams]
  }
}

