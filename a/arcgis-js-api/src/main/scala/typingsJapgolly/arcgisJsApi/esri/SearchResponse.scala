package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse extends Object {
  /**
    * The index of the source from which the search result was obtained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var activeSourceIndex: Double
  /**
    * An array of error objects returned from the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var errors: js.Array[Error]
  /**
    * The number of search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var numResults: Double
  /**
    * An array of objects representing the results of search. See object specification table below for more information about the result object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var results: js.Array[SearchResponseResults]
  /**
    * The searched expression
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var searchTerm: String
}

object SearchResponse {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    constructor: js.Function,
    errors: js.Array[Error],
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    numResults: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    results: js.Array[SearchResponseResults],
    searchTerm: String
  ): SearchResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], numResults = numResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SearchResponse]
  }
}

