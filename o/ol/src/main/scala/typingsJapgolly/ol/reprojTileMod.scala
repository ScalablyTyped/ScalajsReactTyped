package typingsJapgolly.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Tile", JSImport.Namespace)
@js.native
object reprojTileMod extends js.Object {
  @js.native
  trait ReprojTile
    extends typingsJapgolly.ol.olTileMod.default {
    def getImage(): HTMLCanvasElement = js.native
  }
  
  @js.native
  class default protected () extends ReprojTile {
    def this(
      sourceProj: typingsJapgolly.ol.projectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double,
      opt_renderEdges: Boolean
    ) = this()
  }
  
  type FunctionType = js.Function4[
    /* p0 */ Double, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Double, 
    typingsJapgolly.ol.olTileMod.default
  ]
}

