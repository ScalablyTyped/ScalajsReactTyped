package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerViewPixelData extends Object {
  /**
    * The extent of the `pixelBlock`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var extent: js.UndefOr[Extent] = js.undefined
  /**
    * An object representing the pixels in the view. This provides the user access to each pixel on the client via the `pixels` property of this object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelBlock: PixelBlock
}

object ImageryLayerViewPixelData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    pixelBlock: PixelBlock,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    extent: Extent = null
  ): ImageryLayerViewPixelData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], pixelBlock = pixelBlock.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryLayerViewPixelData]
  }
}

