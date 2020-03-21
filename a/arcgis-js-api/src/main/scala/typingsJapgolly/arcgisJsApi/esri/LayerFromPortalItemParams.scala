package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromPortalItemParams extends Object {
  /**
    * The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  var portalItem: PortalItem
}

object LayerFromPortalItemParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    portalItem: PortalItem,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): LayerFromPortalItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], portalItem = portalItem.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[LayerFromPortalItemParams]
  }
}

