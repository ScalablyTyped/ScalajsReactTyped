package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelStopSymbols extends Object {
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.undefined
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.undefined
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.undefined
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.undefined
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.undefined
}

object DirectionsViewModelStopSymbols {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    first: Symbol = null,
    last: Symbol = null,
    middle: Symbol = null,
    unlocated: Symbol = null,
    waypoint: Symbol = null
  ): DirectionsViewModelStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (unlocated != null) __obj.updateDynamic("unlocated")(unlocated.asInstanceOf[js.Any])
    if (waypoint != null) __obj.updateDynamic("waypoint")(waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelStopSymbols]
  }
}

