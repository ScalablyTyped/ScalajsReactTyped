package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointSymbol3DVerticalOffsetProperties extends Object {
  /**
    * The maximum vertical symbol offset in world units. It acts as an upper bound to avoid vertical offset becoming too big.  In the following animation the green symbols have `maxWorldLength = 50` and orange symbols don't have `maxWorldLength` set:  ![maxWorldLength](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-maxWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum vertical symbol offset in world units. It acts as a lower bound to avoid vertical offset becoming too small.  In the following animation the green symbol on the left has `minWorldLength = 20` and for the orange symbol on the right `minWorldLength` has not been set:  ![minWorldLength-on](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-minWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.undefined
  /**
    * The vertical symbol offset in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.undefined
}

object PointSymbol3DVerticalOffsetProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    maxWorldLength: Int | Double = null,
    minWorldLength: Int | Double = null,
    screenLength: Int | Double = null
  ): PointSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (maxWorldLength != null) __obj.updateDynamic("maxWorldLength")(maxWorldLength.asInstanceOf[js.Any])
    if (minWorldLength != null) __obj.updateDynamic("minWorldLength")(minWorldLength.asInstanceOf[js.Any])
    if (screenLength != null) __obj.updateDynamic("screenLength")(screenLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSymbol3DVerticalOffsetProperties]
  }
}

