package typingsJapgolly.ol

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTileMod {
  
  @JSImport("ol/reproj/Tile", JSImport.Default)
  @js.native
  open class default protected () extends ReprojTile {
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double,
      opt_renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Unit,
      opt_renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double,
      opt_renderEdges: Boolean,
      opt_contextOptions: Any
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double,
      opt_renderEdges: Unit,
      opt_contextOptions: Any
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Unit,
      opt_renderEdges: Boolean,
      opt_contextOptions: Any
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Unit,
      opt_renderEdges: Unit,
      opt_contextOptions: Any
    ) = this()
  }
  
  type FunctionType = js.Function4[
    /* p0 */ Double, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Double, 
    typingsJapgolly.ol.tileMod.default
  ]
  
  @js.native
  trait ReprojTile
    extends typingsJapgolly.ol.tileMod.default {
    
    /**
      * Get the HTML Canvas element for this tile.
      */
    def getImage(): HTMLCanvasElement = js.native
  }
}
