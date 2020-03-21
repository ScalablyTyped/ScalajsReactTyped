package typingsJapgolly.tilebelt.tilebelt

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilebeltStatic extends js.Object {
  /**
    * Get the smallest tile to cover a bbox
    *
    * @name bboxToTile
    * @param {Array<number>} bbox
    * @returns {Array<number>} tile
    * @example
    * var tile = bboxToTile([ -178, 84, -177, 85 ])
    * //=tile
    */
  def bboxToTile(bbox: js.Array[Double]): js.Array[Double]
  /**
    * Get the 4 tiles one zoom level higher
    *
    * @name getChildren
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getChildren([5, 10, 10])
    * //=tiles
    */
  def getChildren(tile: js.Array[Double]): js.Array[js.Array[Double]]
  /**
    * Get the tile one zoom level lower
    *
    * @name getParent
    * @param {Array<number>} tile
    * @returns {Array<number>} tile
    * @example
    * var tile = getParent([5, 10, 10])
    * //=tile
    */
  def getParent(tile: js.Array[Double]): js.Array[Double]
  /**
    * Get the 3 sibling tiles for a tile
    *
    * @name getSiblings
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getSiblings([5, 10, 10])
    * //=tiles
    */
  def getSiblings(tile: js.Array[Double]): js.Array[js.Array[Double]]
  /**
    * Check to see if an array of tiles contains a tiles siblings
    *
    * @name hasSiblings
    * @param {Array<number>} tile
    * @param {Array<Array<number>>} tiles
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasSiblings([0, 0, 5], tiles)
    * //=boolean
    */
  def hasSiblings(tile: js.Array[Double], tiles: js.Array[js.Array[Double]]): Boolean
  /**
    * Check to see if an array of tiles contains a particular tile
    *
    * @name hasTile
    * @param {Array<Array<number>>} tiles
    * @param {Array<number>} tile
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasTile(tiles, [0, 0, 5])
    * //=boolean
    */
  def hasTile(tiles: js.Array[js.Array[Double]], tile: js.Array[Double]): Boolean
  /**
    * Get the tile for a point at a specified zoom level
    *
    * @name pointToTile
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile
    * @example
    * var tile = pointToTile(1, 1, 20)
    * //=tile
    */
  def pointToTile(lon: Double, lat: Double, z: Double): js.Array[Double]
  /**
    * Get the precise fractional tile location for a point at a zoom level
    *
    * @name pointToTileFraction
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile fraction
    * var tile = pointToTileFraction(30.5, 50.5, 15)
    * //=tile
    */
  def pointToTileFraction(lon: Double, lat: Double, z: Double): js.Array[Double]
  /**
    * Get the tile for a quadkey
    *
    * @name quadkeyToTile
    * @param {string} quadkey
    * @returns {Array<number>} tile
    * @example
    * var tile = quadkeyToTile('00001033')
    * //=tile
    */
  def quadkeyToTile(quadkey: String): js.Array[Double]
  /**
    * Get the bbox of a tile
    *
    * @name tileToBBOX
    * @param {Array<number>} tile
    * @returns {Array<number>} bbox
    * @example
    * var bbox = tileToBBOX([5, 10, 10])
    * //=bbox
    */
  def tileToBBOX(tile: js.Array[Double]): js.Array[Double]
  /**
    * Get a geojson representation of a tile
    *
    * @name tileToGeoJSON
    * @param {Array<number>} tile
    * @returns {Feature<Polygon>}
    * @example
    * var poly = tileToGeoJSON([5, 10, 10])
    * //=poly
    */
  def tileToGeoJSON(tile: js.Array[Double]): Feature[Polygon, GeoJsonProperties]
  /**
    * Get the quadkey for a tile
    *
    * @name tileToQuadkey
    * @param {Array<number>} tile
    * @returns {string} quadkey
    * @example
    * var quadkey = tileToQuadkey([0, 1, 5])
    * //=quadkey
    */
  def tileToQuadkey(tile: js.Array[Double]): String
  /**
    * Check to see if two tiles are the same
    *
    * @name tilesEqual
    * @param {Array<number>} tile1
    * @param {Array<number>} tile2
    * @returns {boolean}
    * @example
    * tilesEqual([0, 1, 5], [0, 0, 5])
    * //=boolean
    */
  def tilesEqual(tile1: js.Array[Double], tile2: js.Array[Double]): Boolean
}

object TilebeltStatic {
  @scala.inline
  def apply(
    bboxToTile: js.Array[Double] => CallbackTo[js.Array[Double]],
    getChildren: js.Array[Double] => CallbackTo[js.Array[js.Array[Double]]],
    getParent: js.Array[Double] => CallbackTo[js.Array[Double]],
    getSiblings: js.Array[Double] => CallbackTo[js.Array[js.Array[Double]]],
    hasSiblings: (js.Array[Double], js.Array[js.Array[Double]]) => CallbackTo[Boolean],
    hasTile: (js.Array[js.Array[Double]], js.Array[Double]) => CallbackTo[Boolean],
    pointToTile: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    pointToTileFraction: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    quadkeyToTile: String => CallbackTo[js.Array[Double]],
    tileToBBOX: js.Array[Double] => CallbackTo[js.Array[Double]],
    tileToGeoJSON: js.Array[Double] => CallbackTo[Feature[Polygon, GeoJsonProperties]],
    tileToQuadkey: js.Array[Double] => CallbackTo[String],
    tilesEqual: (js.Array[Double], js.Array[Double]) => CallbackTo[Boolean]
  ): TilebeltStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bboxToTile")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => bboxToTile(t0).runNow()))
    __obj.updateDynamic("getChildren")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => getChildren(t0).runNow()))
    __obj.updateDynamic("getParent")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => getParent(t0).runNow()))
    __obj.updateDynamic("getSiblings")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => getSiblings(t0).runNow()))
    __obj.updateDynamic("hasSiblings")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[js.Array[scala.Double]]) => hasSiblings(t0, t1).runNow()))
    __obj.updateDynamic("hasTile")(js.Any.fromFunction2((t0: js.Array[js.Array[scala.Double]], t1: js.Array[scala.Double]) => hasTile(t0, t1).runNow()))
    __obj.updateDynamic("pointToTile")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => pointToTile(t0, t1, t2).runNow()))
    __obj.updateDynamic("pointToTileFraction")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => pointToTileFraction(t0, t1, t2).runNow()))
    __obj.updateDynamic("quadkeyToTile")(js.Any.fromFunction1((t0: java.lang.String) => quadkeyToTile(t0).runNow()))
    __obj.updateDynamic("tileToBBOX")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => tileToBBOX(t0).runNow()))
    __obj.updateDynamic("tileToGeoJSON")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => tileToGeoJSON(t0).runNow()))
    __obj.updateDynamic("tileToQuadkey")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => tileToQuadkey(t0).runNow()))
    __obj.updateDynamic("tilesEqual")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => tilesEqual(t0, t1).runNow()))
    __obj.asInstanceOf[TilebeltStatic]
  }
}

