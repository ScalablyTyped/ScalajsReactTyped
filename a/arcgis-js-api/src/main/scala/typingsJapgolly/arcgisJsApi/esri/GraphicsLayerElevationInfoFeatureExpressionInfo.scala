package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsLayerElevationInfoFeatureExpressionInfo extends Object {
  /**
    * An [Arcade expression](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) evaluating to a number that determines the z-value of the feature. If the geometry has z-values, they will be ignored and only `featureExpressionInfo` is used to calculate the vertical position of the graphic. When `mode = "on-the-ground"`, this property has no effect. For line and polygon geometries the result of the expression is the same for all vertices of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[String] = js.undefined
}

object GraphicsLayerElevationInfoFeatureExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    expression: String = null
  ): GraphicsLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsLayerElevationInfoFeatureExpressionInfo]
  }
}

