package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapImageLayerCreateExportImageParametersOptions extends Object {
  /**
    * The pixel ratio to apply to the dpi of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#createExportImageParameters)
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  /**
    * The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#createExportImageParameters)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The time instant or time extent of content to render.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#createExportImageParameters)
    */
  var timeExtent: js.UndefOr[js.Any] = js.undefined
}

object MapImageLayerCreateExportImageParametersOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    pixelRatio: Int | Double = null,
    rotation: Int | Double = null,
    timeExtent: js.Any = null
  ): MapImageLayerCreateExportImageParametersOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapImageLayerCreateExportImageParametersOptions]
  }
}

