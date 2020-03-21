package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDockOptionsBreakpoint extends Object {
  /**
    * The maximum height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The maximum width of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PopupDockOptionsBreakpoint {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    height: Int | Double = null,
    width: Int | Double = null
  ): PopupDockOptionsBreakpoint = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDockOptionsBreakpoint]
  }
}

