package typingsJapgolly.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  @js.native
  trait LayerRenderer[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */]
    extends typingsJapgolly.ol.observableMod.default {
    /* protected */ def createLoadedTileFinder(
      source: typingsJapgolly.ol.sourceTileMod.default,
      projection: typingsJapgolly.ol.projectionMod.default,
      tiles: NumberDictionary[StringDictionary[typingsJapgolly.ol.olTileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean] = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ FeatureLike, 
          /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          T
        ],
      declutteredFeatures: js.Array[FeatureLike]
    ): T | Unit = js.native
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array = js.native
    def getFeatures(pixel: Pixel): js.Promise[
        js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
      ] = js.native
    def getLayer(): LayerType = js.native
    def handleFontsChanged(): Unit = js.native
    /* protected */ def loadImage(image: typingsJapgolly.ol.imageBaseMod.default): Boolean = js.native
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typingsJapgolly.ol.olTileMod.default]],
      zoom: Double,
      tile: typingsJapgolly.ol.olTileMod.default
    ): Unit = js.native
    def prepareFrame(frameState: FrameState): Boolean = js.native
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
  
  @js.native
  class default[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
}

