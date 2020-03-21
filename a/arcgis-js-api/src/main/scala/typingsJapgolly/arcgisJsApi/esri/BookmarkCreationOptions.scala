package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreationOptions extends Object {
  /**
    * Indicates whether the extent of the current view will become the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent) of a newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureExtent: js.UndefOr[Boolean] = js.undefined
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkCreationOptionsScreenshotSettings] = js.undefined
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created. The screenshot will be set as the [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail) in the newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var takeScreenshot: js.UndefOr[Boolean] = js.undefined
}

object BookmarkCreationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    captureExtent: js.UndefOr[Boolean] = js.undefined,
    screenshotSettings: BookmarkCreationOptionsScreenshotSettings = null,
    takeScreenshot: js.UndefOr[Boolean] = js.undefined
  ): BookmarkCreationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(captureExtent)) __obj.updateDynamic("captureExtent")(captureExtent.asInstanceOf[js.Any])
    if (screenshotSettings != null) __obj.updateDynamic("screenshotSettings")(screenshotSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(takeScreenshot)) __obj.updateDynamic("takeScreenshot")(takeScreenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkCreationOptions]
  }
}

