package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.AbortSignal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ease-in-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ease-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ease-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ease
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.linear
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToOptions2D extends Object {
  /**
    * Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * The duration of the animation in milliseconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var easing: js.UndefOr[linear | ease | `ease-in` | `ease-out` | `ease-in-out` | js.Function] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object GoToOptions2D {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: linear | ease | `ease-in` | `ease-out` | `ease-in-out` | js.Function = null,
    signal: AbortSignal = null
  ): GoToOptions2D = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToOptions2D]
  }
}

