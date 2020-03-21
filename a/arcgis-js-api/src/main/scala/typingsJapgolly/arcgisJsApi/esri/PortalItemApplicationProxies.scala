package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemApplicationProxies extends Object {
  /**
    * The proxy ID registered in ArcGIS Online or ArcGIS Enterprise Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var proxyId: String
  /**
    * The proxy URL for the source URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var proxyUrl: String
  /**
    * The URL of the premium map service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var sourceUrl: String
}

object PortalItemApplicationProxies {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    proxyId: String,
    proxyUrl: String,
    sourceUrl: String
  ): PortalItemApplicationProxies = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], proxyId = proxyId.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PortalItemApplicationProxies]
  }
}

