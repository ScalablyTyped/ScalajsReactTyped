package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIAddComponent extends Object {
  /**
    * The component to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var component: Widget_ | HTMLElement | String
  /**
    * The placement index of the component. This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left. **Possible Values:** bottom-leading | bottom-left | bottom-right | bottom-trailing | top-leading | top-left | top-right | top-trailing | manual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var position: js.UndefOr[String] = js.undefined
}

object UIAddComponent {
  @scala.inline
  def apply(
    component: Widget_ | HTMLElement | String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    index: Int | Double = null,
    position: String = null
  ): UIAddComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIAddComponent]
  }
}

