package typingsJapgolly.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.rendererMapMod.HitMatch
import typingsJapgolly.ol.rendererVectorMod.FeatureCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererLayerMod {
  
  @JSImport("ol/renderer/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
  @js.native
  trait LayerRenderer[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */]
    extends typingsJapgolly.ol.observableMod.default {
    
    /**
      * Create a function that adds loaded tiles to the tile lookup.
      */
    /* protected */ def createLoadedTileFinder(
      source: typingsJapgolly.ol.sourceTileMod.default,
      projection: typingsJapgolly.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typingsJapgolly.ol.tileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean] = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: FeatureCallback[T],
      matches: js.Array[HitMatch[T]]
    ): js.UndefOr[T] = js.native
    
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array = js.native
    
    /**
      * Asynchronous layer level hit detection.
      */
    def getFeatures(pixel: Pixel): js.Promise[
        js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
      ] = js.native
    
    def getLayer(): LayerType = js.native
    
    /**
      * Perform action necessary to get the layer rendered after new fonts have loaded
      */
    def handleFontsChanged(): Unit = js.native
    
    /* protected */ var layer_ : LayerType = js.native
    
    /**
      * Load the image if not already loaded, and register the image change
      * listener if needed.
      */
    /* protected */ def loadImage(image: typingsJapgolly.ol.imageBaseMod.default): Boolean = js.native
    
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typingsJapgolly.ol.tileMod.default]],
      zoom: Double,
      tile: typingsJapgolly.ol.tileMod.default
    ): Boolean = js.native
    
    /**
      * Determine whether render should be called.
      */
    def prepareFrame(frameState: FrameState): Boolean = js.native
    
    /**
      * Render the layer.
      */
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
}
