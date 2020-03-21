package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreationOptionsScreenshotSettings extends Object {
  /**
    * Used to take a screenshot of a subregion of the view. Defaults to the whole view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var area: js.UndefOr[BookmarkCreationOptionsScreenshotSettingsArea] = js.undefined
  /**
    * The height (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * An optional list of layers to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /**
    * The width (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object BookmarkCreationOptionsScreenshotSettings {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    area: BookmarkCreationOptionsScreenshotSettingsArea = null,
    height: Int | Double = null,
    layers: js.Array[Layer] = null,
    width: Int | Double = null
  ): BookmarkCreationOptionsScreenshotSettings = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkCreationOptionsScreenshotSettings]
  }
}

