package typingsJapgolly.ol.tilegridTileGridMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileGrid extends js.Object {
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  def forEachTileCoord(extent: Extent, zoom: Double, callback: js.Function1[/* p0 */ TileCoord, Unit]): Unit = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean]
  ): Boolean = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean],
    opt_tileRange: typingsJapgolly.ol.tileRangeMod.default
  ): Boolean = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean],
    opt_tileRange: typingsJapgolly.ol.tileRangeMod.default,
    opt_extent: Extent
  ): Boolean = js.native
  def getExtent(): Extent = js.native
  def getFullTileRange(z: Double): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getOrigin(z: Double): Coordinate = js.native
  def getResolution(z: Double): Double = js.native
  def getResolutions(): js.Array[Double] = js.native
  def getTileCoordCenter(tileCoord: TileCoord): Coordinate = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default, opt_extent: Extent): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getTileCoordExtent(tileCoord: TileCoord): Extent = js.native
  def getTileCoordExtent(tileCoord: TileCoord, opt_extent: Extent): Extent = js.native
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double): TileCoord = js.native
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double): TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordResolution(tileCoord: TileCoord): Double = js.native
  def getTileRangeExtent(z: Double, tileRange: typingsJapgolly.ol.tileRangeMod.default): Extent = js.native
  def getTileRangeExtent(z: Double, tileRange: typingsJapgolly.ol.tileRangeMod.default, opt_extent: Extent): Extent = js.native
  def getTileRangeForExtentAndZ(extent: Extent, z: Double): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getTileRangeForExtentAndZ(extent: Extent, z: Double, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default): typingsJapgolly.ol.tileRangeMod.default = js.native
  def getTileSize(z: Double): Double | Size = js.native
  def getZForResolution(resolution: Double): Double = js.native
  def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
}

