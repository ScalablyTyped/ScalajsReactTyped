package typingsJapgolly.heremaps.H.map.layer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.geo.Rect
import typingsJapgolly.heremaps.H.map.layer.ITileLayer.Response
import typingsJapgolly.heremaps.H.map.provider.Tile
import typingsJapgolly.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides data partitioned in quad-tree tiles in an x, y, z fashion (where z describes the level within the tree and x and y describe the absolute
  * column and row indeces whithin the level).
  */
trait ITileLayer_ extends js.Object {
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  def cancelTile(x: Double, y: Double, z: Double): Unit
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit
  /**
    * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
    * @param zoomLevel {number} - The zoom level for which the tiles are requested
    * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
    */
  def requestTiles(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response
}

object ITileLayer_ {
  @scala.inline
  def apply(
    cancelTile: (Double, Double, Double) => Callback,
    requestTile: (Double, Double, Double, Boolean) => CallbackTo[Tile | Unit],
    requestTiles: (Rect, Double, Boolean, Point) => CallbackTo[Response]
  ): ITileLayer_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelTile")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => cancelTile(t0, t1, t2).runNow()))
    __obj.updateDynamic("requestTile")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => requestTile(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("requestTiles")(js.Any.fromFunction4((t0: typingsJapgolly.heremaps.H.geo.Rect, t1: scala.Double, t2: scala.Boolean, t3: typingsJapgolly.heremaps.H.math.Point) => requestTiles(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ITileLayer_]
  }
}

