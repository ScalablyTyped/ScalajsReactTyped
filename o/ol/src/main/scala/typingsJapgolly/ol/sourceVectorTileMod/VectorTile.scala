package typingsJapgolly.ol.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typingsJapgolly.ol.urlTileMod.default {
  var tileClass: typingsJapgolly.ol.olVectorTileMod.default = js.native
  def addSourceTiles(
    tile: typingsJapgolly.ol.vectorRenderTileMod.default,
    sourceTiles: js.Array[typingsJapgolly.ol.olVectorTileMod.default]
  ): Unit = js.native
  def getOverlaps(): Boolean = js.native
  def getSourceTiles(
    pixelRatio: Double,
    projection: typingsJapgolly.ol.projectionMod.default,
    tile: typingsJapgolly.ol.vectorRenderTileMod.default
  ): js.Array[typingsJapgolly.ol.olVectorTileMod.default] = js.native
  def removeSourceTiles(tile: typingsJapgolly.ol.vectorRenderTileMod.default): Unit = js.native
}

