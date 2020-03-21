package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominantCategoriesPredominantCategoriesParams extends Object {
  /**
    * An array of numeric fields from which to determine predominant categories. The fields must all be number fields and they must be competing or complementary (e.g. population totals by language spoken at home, or harvested acres by crop type, or the results of an election by candidate or party).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var fields: js.Array[String]
  /**
    * The layer from which to generate predominant categories for the given set of `fields`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * The view in which features will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
}

object predominantCategoriesPredominantCategoriesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[String],
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    view: MapView | SceneView = null
  ): predominantCategoriesPredominantCategoriesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominantCategoriesPredominantCategoriesParams]
  }
}

