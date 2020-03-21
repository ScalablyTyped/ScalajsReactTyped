package typingsJapgolly.chromeApps.chrome.wallpaper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WallpaperDetails extends js.Object {
  /** The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /** The file name of the saved wallpaper. */
  var filename: String
  /**
    * The supported wallpaper layouts.
    * @see WallpaperLayout
    */
  var layout: WallpaperLayout | WallpaperLayoutType
  /** True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
  /** The URL of the wallpaper to be set. */
  var url: js.UndefOr[String] = js.undefined
}

object WallpaperDetails {
  @scala.inline
  def apply(
    filename: String,
    layout: WallpaperLayout | WallpaperLayoutType,
    data: scala.scalajs.js.typedarray.ArrayBuffer = null,
    thumbnail: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): WallpaperDetails = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WallpaperDetails]
  }
}

