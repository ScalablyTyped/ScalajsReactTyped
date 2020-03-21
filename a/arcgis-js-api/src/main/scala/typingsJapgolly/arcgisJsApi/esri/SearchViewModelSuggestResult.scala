package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSuggestResult extends Object {
  /**
    * The key related to the suggest result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResult)
    */
  var key: String
  /**
    * The index of the currently selected result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResult)
    */
  var sourceIndex: Double
  /**
    * The string name of the suggested location to geocode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SuggestResult)
    */
  var text: String
}

object SearchViewModelSuggestResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    key: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    sourceIndex: Double,
    text: String
  ): SearchViewModelSuggestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SearchViewModelSuggestResult]
  }
}

