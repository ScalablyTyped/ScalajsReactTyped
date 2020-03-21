package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbolUtilsGetDisplayedSymbolOptions extends Object {
  /**
    * The [resolution](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resolution) of the view at which the symbol is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * The [view scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) at which the symbol is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The spatial reference of the view in which the symbol is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  /**
    * The [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) of the view, if the symbol is displayed in a SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    */
  var viewingMode: js.UndefOr[String] = js.undefined
}

object symbolUtilsGetDisplayedSymbolOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    resolution: Int | Double = null,
    scale: Int | Double = null,
    spatialReference: SpatialReference = null,
    viewingMode: String = null
  ): symbolUtilsGetDisplayedSymbolOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (viewingMode != null) __obj.updateDynamic("viewingMode")(viewingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[symbolUtilsGetDisplayedSymbolOptions]
  }
}

