package typingsJapgolly.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileSourceOptions extends js.Object {
  /**
    * A bounding box that specifies where tiles are available.
    * Note: This will not crop tiles to the specific bounding box, it limits the tiles it loads to those that intersect this bounding box.
    */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The maximum zoom level tiles that tiles should be rendered at. */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /** The minimum zoom level tiles that tiles should be rendered at. */
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * Required. This can be a string or a callback function that constructs the URLs used to retrieve tiles from the tile source.
    * When using a string, the uriConstructor will allow you to specify placeholders that will be replaced with the tiles value (i.e. {quadkey}).
    * See the Tile URL Parameters section for a list of supported parameters.
    * Besides using formatted tile URLs, you can also specify a callback function as the uriConstructor. This is useful if you need to be able to
    * build custom tile URL’s that may require some additional calculations for a tile.
    */
  var uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String])
}

object ITileSourceOptions {
  @scala.inline
  def apply(
    uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String]),
    bounds: LocationRect = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null
  ): ITileSourceOptions = {
    val __obj = js.Dynamic.literal(uriConstructor = uriConstructor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITileSourceOptions]
  }
}

