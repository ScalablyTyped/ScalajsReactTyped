package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominantCategoriesResult extends Object {
  /**
    * An array of objects describing the count of each predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos]
}

object PredominantCategoriesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): PredominantCategoriesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PredominantCategoriesResult]
  }
}

