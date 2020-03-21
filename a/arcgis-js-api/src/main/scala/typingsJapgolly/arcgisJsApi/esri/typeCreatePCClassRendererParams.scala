package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeCreatePCClassRendererParams extends Object {
  /**
    * The number of points per inch in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    *
    * @default 25
    */
  var density: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field containing classification data for the given layer. A common field name used for this renderer type is `CLASS_CODE`, though other fields can be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    */
  var field: String
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    */
  var layer: PointCloudLayer
  /**
    * The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    *
    * @default 100%
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    */
  var statistics: js.UndefOr[UniqueValuesResult] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined type scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    */
  var typeScheme: js.UndefOr[TypeSchemeForPoint] = js.undefined
}

object typeCreatePCClassRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: PointCloudLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    density: Int | Double = null,
    size: String = null,
    statistics: UniqueValuesResult = null,
    typeScheme: TypeSchemeForPoint = null
  ): typeCreatePCClassRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (typeScheme != null) __obj.updateDynamic("typeScheme")(typeScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeCreatePCClassRendererParams]
  }
}

