package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreationOptionsScreenshotSettingsArea extends Object {
  /**
    * The height of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The width of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x value of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var y: js.UndefOr[Double] = js.undefined
}

object BookmarkCreationOptionsScreenshotSettingsArea {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): BookmarkCreationOptionsScreenshotSettingsArea = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkCreationOptionsScreenshotSettingsArea]
  }
}

