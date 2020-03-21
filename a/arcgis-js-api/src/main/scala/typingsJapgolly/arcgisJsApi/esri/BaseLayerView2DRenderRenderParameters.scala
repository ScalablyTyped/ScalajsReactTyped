package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerView2DRenderRenderParameters extends Object {
  /**
    * The [canvas 2D context](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) in which to draw content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var context: CanvasRenderingContext2D
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var state: ViewState
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var stationary: Boolean
}

object BaseLayerView2DRenderRenderParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    context: CanvasRenderingContext2D,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    state: ViewState,
    stationary: Boolean
  ): BaseLayerView2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[BaseLayerView2DRenderRenderParameters]
  }
}

