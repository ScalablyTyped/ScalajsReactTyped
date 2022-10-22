package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasTileLayerMod {
  
  @JSImport("ol/renderer/canvas/TileLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typingsJapgolly.ol.layerTileMod.default) = this()
    def this(tileLayer: typingsJapgolly.ol.layerVectorTileMod.default) = this()
  }
  
  @js.native
  trait CanvasTileLayerRenderer
    extends typingsJapgolly.ol.rendererCanvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    
    def drawTileImage(
      tile: typingsJapgolly.ol.imageTileMod.default,
      frameState: FrameState,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean,
      opacity: Double
    ): Unit = js.native
    
    def getImage(): HTMLCanvasElement = js.native
    
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typingsJapgolly.ol.tileMod.default = js.native
    
    /**
      * Get the image from a tile.
      */
    /* protected */ def getTileImage(tile: typingsJapgolly.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /* protected */ def isDrawableTile(tile: typingsJapgolly.ol.tileMod.default): Boolean = js.native
    
    /**
      * Manage tile pyramid.
      * This function performs a number of functions related to the tiles at the
      * current zoom and lower zoom levels:
      *
      * registers idle tiles in frameState.wantedTiles so that they are not
      * discarded by the tile queue
      * enqueues missing tiles
      *
      */
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    
    /* protected */ var renderedPixelRatio: Double = js.native
    
    /* protected */ var renderedProjection: typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ var renderedRevision: Double = js.native
    
    /* protected */ var renderedTiles: js.Array[typingsJapgolly.ol.tileMod.default] = js.native
    
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typingsJapgolly.ol.sourceTileMod.default): Unit = js.native
    
    /* protected */ var tmpExtent: Extent = js.native
    
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tile: typingsJapgolly.ol.tileMod.default
    ): Unit = js.native
  }
}
