package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleElements extends Object {
  /**
    * Indicates whether to button to add a new bookmark displays. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#VisibleElements)
    */
  var addBookmark: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the thumbnail associated with the bookmark displays. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#VisibleElements)
    */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
}

object VisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    addBookmark: js.UndefOr[Boolean] = js.undefined,
    thumbnail: js.UndefOr[Boolean] = js.undefined
  ): VisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(addBookmark)) __obj.updateDynamic("addBookmark")(addBookmark.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleElements]
  }
}

