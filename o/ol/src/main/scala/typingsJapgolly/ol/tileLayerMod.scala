package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/TileLayer", JSImport.Namespace)
@js.native
object tileLayerMod extends js.Object {
  @js.native
  trait CanvasTileLayerRenderer
    extends typingsJapgolly.ol.canvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    var renderedPixelRatio: Double = js.native
    var renderedProjection: typingsJapgolly.ol.projectionMod.default = js.native
    var renderedRevision: Double = js.native
    var renderedTiles: js.Array[typingsJapgolly.ol.olTileMod.default] = js.native
    var tmpExtent: Extent = js.native
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
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typingsJapgolly.ol.olTileMod.default = js.native
    /* protected */ def getTileImage(tile: typingsJapgolly.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    /* protected */ def isDrawableTile(tile: typingsJapgolly.ol.olTileMod.default): Boolean = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typingsJapgolly.ol.sourceTileMod.default): Unit = js.native
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      tileSource: typingsJapgolly.ol.sourceTileMod.default,
      tile: typingsJapgolly.ol.olTileMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typingsJapgolly.ol.tileMod.default) = this()
    def this(tileLayer: typingsJapgolly.ol.vectorTileMod.default) = this()
  }
  
}

