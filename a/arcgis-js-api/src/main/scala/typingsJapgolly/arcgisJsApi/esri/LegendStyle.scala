package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`side-by-side`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.auto
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.card
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.classic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stack
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendStyle extends Object {
  /**
    * When a `card` type is specified, you can specify one of the following layout options.
    *
    * Value | Description
    * ------|------------
    * auto | This layout is responsive so that in wide views the legend has a `side-by-side` layout, and a `stack` layout in smaller (mobile) views.
    * side-by-side | The legend has a landscape orientation that allows users to scroll horizontally to view multiple legend cards at a time.
    * stack | The legend cards are stacked, which conserves space, but restricts the user to seeing only one card at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    *
    * @default stack
    */
  var layout: js.UndefOr[auto | `side-by-side` | stack] = js.undefined
  /**
    * Specifies the style of the legend. There are two possible values listed in the table below:
    *
    * Value | Description
    * ------|------------
    * classic | The legend has a portrait orientation. The user can scroll vertically when many elements are included in the legend's content.
    * card | In wide views, the legend has a landscape orientation that allows users to scroll horizontally to view all legend elements. This style can be responsive, making it ideal for mobile web apps. In smaller views, the legend collapses to occupy less space. One element is shown at a time in a card-style layout, which the user can navigate horizontally.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var `type`: classic | card
}

object LegendStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: classic | card,
    layout: auto | `side-by-side` | stack = null
  ): LegendStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendStyle]
  }
}

