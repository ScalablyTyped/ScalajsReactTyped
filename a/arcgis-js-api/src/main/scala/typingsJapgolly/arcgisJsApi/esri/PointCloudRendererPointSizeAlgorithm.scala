package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`fixed-size`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.splat
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererPointSizeAlgorithm extends Object {
  /**
    * Specifies the scale factor that is applied to the size estimated by the density. Applies to `splat` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    *
    * @default 1
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * Point size in meters (`useRealWorldSymbolSizes = true`) or points. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * `fixed-size` or `splat`. Choosing `fixed-size` implies setting `size` and `useRealWorldSymbolSizes`. If `splat` is chosen then `scaleFactor` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var `type`: `fixed-size` | splat
  /**
    * Specifies whether `size` is in real world units or screen-space units. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}

object PointCloudRendererPointSizeAlgorithm {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `fixed-size` | splat,
    scaleFactor: Int | Double = null,
    size: Int | Double = null,
    useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
  ): PointCloudRendererPointSizeAlgorithm = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useRealWorldSymbolSizes)) __obj.updateDynamic("useRealWorldSymbolSizes")(useRealWorldSymbolSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRendererPointSizeAlgorithm]
  }
}

