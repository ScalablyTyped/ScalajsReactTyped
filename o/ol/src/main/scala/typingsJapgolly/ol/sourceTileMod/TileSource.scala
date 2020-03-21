package typingsJapgolly.ol.sourceTileMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileSource
  extends typingsJapgolly.ol.sourceSourceMod.default {
  var tileCache: typingsJapgolly.ol.tileCacheMod.default = js.native
  var tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default = js.native
  var tileOptions: typingsJapgolly.ol.olTileMod.Options = js.native
  var tmpSize: Size = js.native
  def canExpireCache(): Boolean = js.native
  def clear(): Unit = js.native
  def expireCache(
    projection: typingsJapgolly.ol.projectionMod.default,
    usedTiles: StringDictionary[typingsJapgolly.ol.tileRangeMod.default]
  ): Unit = js.native
  def forEachLoadedTile(
    projection: typingsJapgolly.ol.projectionMod.default,
    z: Double,
    tileRange: typingsJapgolly.ol.tileRangeMod.default,
    callback: js.Function1[/* p0 */ typingsJapgolly.ol.olTileMod.default, Boolean]
  ): Boolean = js.native
  def getGutterForProjection(projection: typingsJapgolly.ol.projectionMod.default): Double = js.native
  /* protected */ def getKey(): String = js.native
  def getOpaque(projection: typingsJapgolly.ol.projectionMod.default): Boolean = js.native
  def getTile(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsJapgolly.ol.projectionMod.default
  ): typingsJapgolly.ol.olTileMod.default = js.native
  /* protected */ def getTileCacheForProjection(projection: typingsJapgolly.ol.projectionMod.default): typingsJapgolly.ol.tileCacheMod.default = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord, opt_projection: typingsJapgolly.ol.projectionMod.default): TileCoord = js.native
  def getTileGrid(): typingsJapgolly.ol.tilegridTileGridMod.default = js.native
  def getTileGridForProjection(projection: typingsJapgolly.ol.projectionMod.default): typingsJapgolly.ol.tilegridTileGridMod.default = js.native
  def getTilePixelRatio(pixelRatio: Double): Double = js.native
  def getTilePixelSize(z: Double, pixelRatio: Double, projection: typingsJapgolly.ol.projectionMod.default): Size = js.native
  /* protected */ def setKey(key: String): Unit = js.native
  def useTile(z: Double, x: Double, y: Double, projection: typingsJapgolly.ol.projectionMod.default): Unit = js.native
}

