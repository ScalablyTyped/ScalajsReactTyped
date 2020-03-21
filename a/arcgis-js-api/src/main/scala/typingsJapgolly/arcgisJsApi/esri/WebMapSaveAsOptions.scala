package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapSaveAsOptions extends Object {
  /**
    * The folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  /**
    * Allow the webmap to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}

object WebMapSaveAsOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    folder: PortalFolder = null,
    ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
  ): WebMapSaveAsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapSaveAsOptions]
  }
}

