package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.AbortSignal
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapImageLayerFetchImageOptions extends Object {
  /**
    * The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  /**
    * The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * The time instant or time extent of content to render.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var timeExtent: js.UndefOr[js.Any] = js.undefined
}

object MapImageLayerFetchImageOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    pixelRatio: Int | Double = null,
    rotation: Int | Double = null,
    signal: AbortSignal = null,
    timeExtent: js.Any = null
  ): MapImageLayerFetchImageOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapImageLayerFetchImageOptions]
  }
}

