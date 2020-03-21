package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarksViewModelProperties extends GoToProperties {
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object BookmarksViewModelProperties {
  @scala.inline
  def apply(
    bookmarks: CollectionProperties[BookmarkProperties] = null,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Callback = null,
    view: MapViewProperties = null
  ): BookmarksViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.arcgisJsApi.esri.MapView | typingsJapgolly.arcgisJsApi.esri.SceneView, t1: /* goToParameters */ js.Any) => goToOverride(t0, t1).runNow()))
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksViewModelProperties]
  }
}

